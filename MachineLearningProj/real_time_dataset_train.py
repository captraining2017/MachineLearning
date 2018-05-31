import pandas as pd
import matplotlib.pyplot as plt
from sklearn import model_selection
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis
from sklearn.linear_model import LogisticRegression
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier, AdaBoostClassifier, BaggingClassifier, ExtraTreesClassifier, \
    GradientBoostingClassifier
from sklearn.metrics import accuracy_score
from sklearn.naive_bayes import GaussianNB
from sklearn.neighbors import KNeighborsClassifier
from sklearn.svm import SVC
from sklearn.tree import DecisionTreeClassifier, ExtraTreeClassifier

plan_info=pd.read_csv('W:\machinelearning\MachineLearningProj\Plan_Info.csv')
bil_provider=pd.read_csv('W:\machinelearning\MachineLearningProj\\Biller_Provider.csv')
claim_info=pd.read_csv('W:\machinelearning\MachineLearningProj\claim_info.csv')
insured_info=pd.read_csv('W:\machinelearning\MachineLearningProj\insured_info.csv')
mem_info=pd.read_csv('W:\machinelearning\MachineLearningProj\Mem_Info.csv')
Render_provider=pd.read_csv('W:\machinelearning\MachineLearningProj\Render_provider.csv')

mem_plan=pd.merge(plan_info,mem_info,on='pid')
insured_plan=pd.merge(plan_info,insured_info,on='pid')
res=pd.concat([mem_plan,insured_plan],join='outer')
complete=pd.merge(claim_info,res,on=['mid','ins_id'],how='left')
complete=pd.merge(complete,Render_provider,on='rpc',how='left')
complete=pd.merge(complete,bil_provider,on='bpc',how='left')
complete.fillna(-1,inplace=True)
complete=complete.drop(['Place of Service Description','Insured DOB','Billing Provider Name','Claim Input Date','Member Admission Date','Member Discharge Date','Claim Reject Reason'],axis=1)
cols = [col for col in complete if col != 'RESULT']+['RESULT']
complete = complete[cols]

data=complete.values[:,:len(cols)-1].tolist()
res=complete.values[:,len(cols)-1].tolist()

train_data,train_res,test_data,test_res=train_test_split(data,res,test_size=0.3)

models=[]
result=[]
accuracy=[]
models.append(('LR',LogisticRegression()))
models.append(('DTC',DecisionTreeClassifier()))
models.append(('ETC',ExtraTreeClassifier()))
models.append(('KNN',KNeighborsClassifier()))
models.append(('SVM',SVC()))
# models.append(('LDA',LinearDiscriminantAnalysis()))
models.append(('GN',GaussianNB()))
models.append(('ABC',AdaBoostClassifier()))
models.append(('BC',BaggingClassifier()))
models.append(('ETC',ExtraTreesClassifier()))
models.append(('GBC',GradientBoostingClassifier()))
models.append(('RFC',RandomForestClassifier()))

for name,model in models:
    # k_fold=model_selection.KFold()
    # cv_results=model_selection.cross_val_score(model, train_data, test_data, cv=k_fold)
    # result.append((name,cv_results.mean()*100))
    # # if (cv_results.mean()*100)>=90:
    # print('%s : %f' % (name,cv_results.mean()*100))
    # cv_results = model_selection.cross_val_predict(model,train_res,test_res,cv=k_fold)
    # accuracy.append((name,accuracy_score(test_res,cv_results)*100))
    model.fit(train_data,test_data)
    cv_results=model.score(train_res,test_res)
    print('%s : %f' % (name, cv_results.mean() * 100))
    cv_results=accuracy_score(test_res,model.predict(train_res))
    print('%s : %f' % (name, cv_results * 100))