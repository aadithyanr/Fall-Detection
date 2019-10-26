# Fall_Detection
An Android App, which detects User fall using Accelerometer, Gyroscope and Magnetometer and send SMS to the Mobile Numbers Stored in the SQLite Database. A service runs in background, continuously monitoring the user, when started tracking. 

Algorithm:
The three-axis Acceleration from Accelerometer will be accumulated as Single Magnitude Vector(SMV) and a threshold value was fixed. Based onthis, if the user falls, the SMV will cross the threshold vector and we can detect fall. 
In addition to that, we are calculating the Degree of phone at that time, if the Degree is greater than 35 degrees, it's considered  a danger to user.(Because assuming this phone is on Helmet and normal inclination of user head being zero, if the head inclination crosses some degree mark (here 35) along with a threshold breach by SMV, concludes that there was a Fall. 

After fall, a toast message displayed and SMS sent to the contacts in SQLite DB.

