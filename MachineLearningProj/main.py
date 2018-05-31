import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

#names=pd.read_csv('C:/Users/lnc/Downloads/names/yob1880.txt')
bil=pd.read_excel('W:/machinelearning/MachineLearningProj/UNIQUE_HOSPITAL_ID.xls')

#names=pd.DataFrame(names[0:100]).values[:,:1].tolist()

bil=pd.DataFrame(bil).values[:,:].tolist()
np.random.shuffle(bil)

bil_uid=pd.DataFrame(bil[0:100]).values[:,0:1].reshape(1,100).tolist()[0]
bil_name=pd.DataFrame(bil[0:100]).values[:,1:2].reshape(1,100).tolist()[0]
bil_pin=pd.DataFrame(bil[0:100]).values[:,3:4].reshape(1,100).tolist()[0]
bil_city=pd.DataFrame(bil[0:100]).values[:,4:5].reshape(1,100).tolist()[0]
bil_state=pd.DataFrame(bil[0:100]).values[:,6:7].reshape(1,100).tolist()[0]
bil_country=np.full((100,1),'India').reshape(1,100).tolist()[0]
bil_tax=np.arange(70000,80000,100,dtype='int64').reshape(1,100).tolist()[0]
bil_typ=np.arange(100,999,1)
np.random.shuffle(bil_typ)
bil_typ=bil_typ[0:100]
bil_typ=pd.DataFrame(bil_typ).values[:,:].reshape(1,100).tolist()[0]
bil_net=[]
net=['INN','ONN']
for i in range(0,100):
    bil_net.append(net[np.random.choice(2)])
bil_net=pd.DataFrame(bil_net).values[:,:].reshape(1,100).tolist()[0]

bil=[]
bil=np.vstack((bil_name,bil_uid,bil_typ,bil_city,bil_pin,bil_state,bil_country,bil_tax,bil_net))
bil=bil.T
pd.DataFrame(bil).to_csv('D:\MachineLearningProj\\bil_pro.csv',sep=',')
