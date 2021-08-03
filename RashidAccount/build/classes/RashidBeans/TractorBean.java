/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RashidBeans;

/**
 *
 * @author Danish
 */
public class TractorBean {
        private int customerId;
	private String customerName;
        private String caste;
        private String tractorWork;
        private int paidMoney;
	private int remainingMoney;
	private String tractorTime;
	private String currentDate;
        private String totalWork;
        private String remarks;
        
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getTractorWork() {
        return tractorWork;
    }

    public void setTractorWork(String tractorWork) {
        this.tractorWork = tractorWork;
    }

    public int getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(int paidMoney) {
        this.paidMoney = paidMoney;
    }

    public int getRemainingMoney() {
        return remainingMoney;
    }

    public void setRemainingMoney(int remainingMoney) {
        this.remainingMoney = remainingMoney;
    }

    public String getTractorTime() {
        return tractorTime;
    }

    public void setTractorTime(String tractorTime) {
        this.tractorTime = tractorTime;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getTotalWork() {
        return totalWork;
    }

    public void setTotalWork(String totalWork) {
        this.totalWork = totalWork;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
        public String toString(){
        return customerName;
        }
}
