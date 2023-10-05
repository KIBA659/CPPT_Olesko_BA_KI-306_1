from TouchScreen import TouchScreen
from monitor import  Monitor
def main():
    monitor = Monitor("aa","1")
    ts =TouchScreen("aa","1","mouse",True,200,5,True,12,24)
    TouchScreen.x=26
    ts.change_type("New Type2")
    monitor.check_additional()
    monitor.change_additional_devices("keyboard")
    monitor.buy(2)
    monitor.turn_off_available()
    monitor.change_type("New Type")
    monitor.change_version("1.0")
    monitor.status()
    monitor.add_price(50)
    monitor.add_count(5)
    ts.status()
    monitor.clear_log_file()
   
    monitor.write_to_log_file("dfdgfgdfgs")

if __name__ == "__main__":
    main()
