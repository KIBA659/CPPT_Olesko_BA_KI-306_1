class Monitor:

    def __init__(self, types="AAd27O", versions="0.1",additionals=True,additional__devices = "mouse",prices = 100,counts = 1,is_availables = True,x=0):
        self.additional = additionals
        self.additional_devices = additional__devices
        self.type = types
        self.version = versions
        self.price = prices
        self.count =counts
        self.is_available = is_availables 


    def check_additional(self):
        print (f"This monitor has additional devices.\n") if  self.additional == True else print (f"This monitor does not have additional devices.\n")

    def change_additional_devices(self, devices):
        if not self.additional:
            print ("This monitor does not have additional devices.\n")
        else:
            print(f"You changed additional devices from {self.additional_devices} to {devices}\n")
            self.additional_devices = devices

    def buy(self, number):
        if self.count < number:
            print(f"Oops! You want to buy more than we have available.\n")
        else:
            n = int(number)
            self.count -= n
            print (f"You bought {n} monitors. Current count: {self.count}\n")

    def turn_off_available(self):
        self.is_available = False
        print(f"Monitor is now unavailable.\n")

    def change_type(self, new_type):
        print(f"Type changed {self.type} to: {new_type}\n")
        self.type = new_type
        

    def change_version(self, new_version):
        print(f"Version {self.version} changed to: {new_version}\n")
        self.version = new_version
         

    def status(self):
        status_info = f"Type: { self.type}\nVersion: { self.version}\nPrice: { self.price}\nCount: { self.count}\nAvailability: { self.is_available} "
        print(status_info)

    def add_price(self, prices):
        print(f"New price:{self.price} -->{prices}\n")
        self.price += prices
         

    def add_count(self, counts):
       print(f"New count: {self.count} --> {counts}\n")
       self.count += counts
       

    def clear_log_file(self):
        with open("Olesko.txt", "w") as log_file:
            log_file.truncate(0)

    def write_to_log_file(self, message):
        with open("Olesko.txt", "a") as log_file:
            log_file.write(message + "\n")

