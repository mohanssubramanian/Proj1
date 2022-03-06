package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Redmi y3");
      }
	private void phoneMieiNum() {
		System.out.println("89461122");
	  }
	private void Camera() {
		System.out.println("13MP,5MP");
	  }
 private void storage() {
	System.out.println("64Gb");
      }
 private void osName() {
	System.out.println("Android");   
      }
 public static void main(String[] args) {
	
	 PhoneInfo ss = new PhoneInfo();
			 ss.phoneName();
			 ss.phoneMieiNum();
			 ss.Camera();
			 ss.storage();
			 ss.osName();
}
}
