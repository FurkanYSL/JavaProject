package Logging;

public class MailLogger extends BaseLogger {
	public void buyLog() {
		System.out.println("Satın Alım Onaylanmıştır ve Maile loglanmıştır.");
	}

	public void rentLog() {
		System.out.println("Kiralama İşlemi Onaylanmıştır ve Maile loglanmıştır.");
	}

	public void sellLog() {
		System.out.println("Satış Onaylanmıştır ve Maile loglanmıştır.");
	}
}
