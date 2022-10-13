package Business;

import DataAccess.CustomerDao;
import DataAccess.VehicleDao;
import Entities.CommonVehicle;
import Entities.Customer;
import Logging.BaseLogger;

public class VehicleManager {
    private VehicleDao vehicledao;
    private CustomerDao customerdao;
    private BaseLogger logger;
    private BaseLogger[] loggers;

    public VehicleManager(VehicleDao vehicledao, CustomerDao customerdao,
            BaseLogger logger/* , BaseLogger[] loggers */) {
        this.vehicledao = vehicledao;
        this.customerdao = customerdao;
        this.logger = logger;
        // this.loggers = loggers;
    }

    public void buyVehicle(CommonVehicle vehicle) throws Exception {
        if (vehicle.age > 20)
            throw new Exception("Araç Yaşı 20 den büyük ise satın alınamaz");
        System.out.println("Araç alınmıştır : " + vehicle.brand + " " + vehicle.model);
        this.logger.buyLog();
        /*
         * for (BaseLogger logger : loggers) {
         * logger.buyLog();
         * }
         */
        vehicledao.add(vehicle);
    }

    public void sellVehicle(Customer customer, CommonVehicle vehicle) throws Exception {
        if (customer.getAge() < 18)
            throw new Exception("18 yaşından küçüklere araba satışı yapılmamaktadır");
        System.out.println("Araç yeni sahibine hayırlı olsun : " + customer.getName() + " " + customer.getLastname());
        this.logger.sellLog();
        /*
         * for (BaseLogger logger : loggers) {
         * logger.sellLog();
         * }
         */
        vehicledao.del(vehicle);
        customerdao.add(customer);
    }

    public void rentVehicle(Customer customer, CommonVehicle vehicle) throws Exception {
        if (customer.getAge() < 20)
            throw new Exception("18 yaşından küçüklere araba kiralaması yapılmamaktadır");
        else if (vehicle.price > 500000)
            throw new Exception("500.000 TL den yüksek fiyatlı arabalarda kiralama işlemi yapılmamaktadır");
        System.out.println("Araç geçici sahibine hayırlı olsun : " + customer.getName() + " " + customer.getLastname());
        this.logger.rentLog();
        /*
         * for (BaseLogger logger : loggers) {
         * logger.rentLog();
         * }
         */
        vehicledao.change(vehicle);
        customerdao.add(customer);
    }
}
