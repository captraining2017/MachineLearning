# -*- coding: utf-8 -*-
import pandas as pd
import numpy as np
from datetime import datetime
import random


def rand_dates(X):
    new_date = []
    for i in range(1,X):
        year = random.choice(range(1950, 2001))
        month = random.choice(range(1, 13))
        day = random.choice(range(1, 29))
        birth_date = datetime(year, month, day)
        new_date.append(datetime.strftime(birth_date, '%m/%d/%y'))
    return new_date

#insurance 
insu_id = np.arange(1001,1101).tolist()
insu_dob = rand_dates(101)
insu_gender = np.array(['M','F'])
insu_relationship = np.array(['C','S','I','E'])

out = open('out.csv', 'w')


#Members
mem_id = np.arange(4000,4101)
mem_policy = np.arange(10000,11001)
np.random.shuffle(mem_policy)
mem_gender = np.array(['M','F'])
mem_policy_status = np.array(['Inforce','Lapsed'])





     
    


