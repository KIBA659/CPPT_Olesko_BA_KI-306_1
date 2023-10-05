from monitor  import Monitor
class TouchScreen(Monitor):
     x= None
     y= None
     def __init__(self, types, versions,additionals,additional__devices,prices,counts,is_availables,x_position,y_position): 
        super(TouchScreen,self).__init__( types, versions,additionals,additional__devices,prices,counts,is_availables)
        self.x = x_position
        self.y = y_position

     def status(self):
         super().status()
         print(f"X = {self.x} Y = {self.y}")

     def get_X(self):
         return  self.x

     def get_Y(self):
         return  self.y

     def set_X(self,x):
         self.x = x

     def set_Y(self,y):
         self.y = y
         