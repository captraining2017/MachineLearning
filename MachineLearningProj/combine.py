import pandas as pd

p1=pd.read_csv('D:/Software Downloaded/MOCK_DATA1.csv')
p=pd.read_csv('D:/Software Downloaded/MOCK_DATA.csv')

join=pd.merge(p1,p,on='id',how='inner')
