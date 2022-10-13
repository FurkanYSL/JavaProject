package Logging;

public class FileLogger extends BaseLogger {
	public void buyLog() {
		System.out.println("Satın Alım Onaylanmıştır ve Dosyaya loglanmıştır.");
	}

	public void rentLog() {
		System.out.println("Kiralama İşlemi Onaylanmıştır ve Dosyaya loglanmıştır.");
	}

	public void sellLog() {
		System.out.println("Satış Onaylanmıştır ve Dosyaya loglanmıştır.");
	}
}
