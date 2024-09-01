package ERPStepDefination;

import org.openqa.selenium.WebDriver;

import commonFunction.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinationImplementation 
{
	public static WebDriver driver;
	@Given("i launch the browser")
	public void i_launch_the_browser() throws Throwable {
		driver= FunctionLibrary.startBrowser();
	}

	@When("i launch the url {string}")
	public void i_launch_the_url(String url) {
		FunctionLibrary.openUrl();
	}

	@When("i wait for username textbox with {string} and {string}")
	public void i_wait_for_username_textbox_with_and(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue,"10");
	}

	@When("enter username with {string} and {string} value {string}")
	public void enter_username_with_and_value(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);

	}

	@When("i enter password with {string} and {string} data {string}")
	public void i_enter_password_with_and_data(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);

	}

	@When("i click on the login button with {string} and {string}")
	public void i_click_on_the_login_button_with_and(String ltype, String lvalue ) {
		FunctionLibrary.clickAction(ltype, lvalue);
	}

	@When("i wait for supplier link with {string} and {string}")
	public void i_wait_for_supplier_link_with_and(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue,"10");
	}

	@When("i click on the supplier  link with {string} and {string}")
	public void i_click_on_the_supplier_link_with_and(String ltype, String lvalue) {
		FunctionLibrary.clickAction(ltype, lvalue);
	}

	@When("i wait for add icon button with {string} and{string}")
	public void i_wait_for_add_icon_button_with_and(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue,"10");
	}

	@When("i click on add icon button with {string} and{string}")
	public void i_click_on_add_icon_button_with_and(String ltype, String lvalue) {
		FunctionLibrary.clickAction(ltype,lvalue);
	}

	@When("i wait for supplier number with {string} and {string}")
	public void i_wait_for_supplier_number_with_and(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue,"10");
	}

	@When("i capture the Supplier number with {string} and {string}")
	public void i_capture_the_Supplier_number_with_and(String ltype, String lvalue) throws Throwable {
		FunctionLibrary.captureSupplier(ltype, lvalue);
	}

	@When("i enter the supplier name {string} , {string} & {string}")
	public void i_enter_the_supplier_name(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier Address {string} , {string} & {string}")
	public void i_enter_the_supplier_Address(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier city {string} , {string} & {string}")
	public void i_enter_the_supplier_city(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier country {string} , {string} & {string}")
	public void i_enter_the_supplier_country(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier contact person {string} , {string} & {string}")
	public void i_enter_the_supplier_contact_person(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier phone number {string} , {string} & {string}")
	public void i_enter_the_supplier_phone_number(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier email {string} , {string} & {string}")
	public void i_enter_the_supplier_email(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier mobile number {string} , {string} & {string}")
	public void i_enter_the_supplier_mobile_number(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the supplier notes {string} , {string} & {string}")
	public void i_enter_the_supplier_notes(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i click on the ADD  button {string} with{string}")
	public void i_click_on_the_ADD_button_with(String ltype, String lvalue) {
		FunctionLibrary.clickAction(ltype, lvalue);
	}
	@Then("i wait for the confirm ok button {string} with {string}")
	public void i_wait_for_the_confirm_ok_button_with(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue,"10");
	}

	@Then("i click  for the confirm ok button {string} with {string}")
	public void i_click_for_the_confirm_ok_button_with(String ltype, String lvalue) {
		FunctionLibrary.clickAction(ltype, lvalue);
	}

	@Then("i wait for the alert ok button {string} with {string}")
	public void i_wait_for_the_alert_ok_button_with(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue,"10");
	}

	@Then("i click for the alert ok button {string} with {string}")
	public void i_click_for_the_alert_ok_button_with(String ltype, String lvalue) {
		FunctionLibrary.clickAction(ltype, lvalue);

	}

	@Then("i verify the supplier table")
	public void i_verify_the_supplier_table() throws Throwable {
		FunctionLibrary.supplierTable();
	}

	@When("i close the browser")
	public void i_close_the_browser() {
		FunctionLibrary.closeBrowser();
	}


	// FOR THE CUSTOMER TABLE
	@When("i wait for customer link with {string} and {string}")
	public void i_wait_for_customer_link_with_and(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue, "10");
	}

	@When("i click on the customer  link with {string} and {string}")
	public void i_click_on_the_customer_link_with_and(String ltype, String lvalue) {
		FunctionLibrary.clickAction(ltype, lvalue);
	}

	@When("i wait for customer number with {string} and {string}")
	public void i_wait_for_customer_number_with_and(String ltype, String lvalue) {
		FunctionLibrary.waitForElement(ltype, lvalue, "10");
	}

	@When("i capture the customer number with {string} and {string}")
	public void i_capture_the_customer_number_with_and(String Ltype, String Lvalue) throws Throwable {
		FunctionLibrary.captuerCustomer(Ltype, Lvalue);
	}

	@When("i enter the customer name {string} , {string} & {string}")
	public void i_enter_the_customer_name(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer Address {string} , {string} & {string}")
	public void i_enter_the_customer_Address(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer city {string} , {string} & {string}")
	public void i_enter_the_customer_city(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer country {string} , {string} & {string}")
	public void i_enter_the_customer_country(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer contact person {string} , {string} & {string}")
	public void i_enter_the_customer_contact_person(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer phone number {string} , {string} & {string}")
	public void i_enter_the_customer_phone_number(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer email {string} , {string} & {string}")
	public void i_enter_the_customer_email(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer mobile number {string} , {string} & {string}")
	public void i_enter_the_customer_mobile_number(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the customer notes {string} , {string} & {string}")
	public void i_enter_the_customer_notes(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@Then("i verify the customer table")
	public void i_verify_the_customer_table() throws Throwable {
		FunctionLibrary.customerTable();
	}

	//for stock item table

	@When("i wait for stock item link with {string} and {string}")
	public void i_wait_for_stock_item_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}

	@When("i click on the stock item  link with {string} and {string}")
	public void i_click_on_the_stock_item_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("i wait for the stock number  with {string} its value {string}")
	public void i_wait_for_the_stock_number_with_its_value(String Ltype, String Lvalue) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("i wait for the category list with {string} its value {string}")
	public void i_wait_for_the_category_list_with_its_value(String Ltype, String Lvalue) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}

	@When("i select the category with {string} its value {string} data{string}")
	public void i_select_the_category_with_its_value_data(String ltype, String lvalue, String testdata) throws Throwable {
		Thread.sleep(2000);
		FunctionLibrary.dropDownAction(ltype, lvalue, testdata);
	}

	@When("i select the supplier with {string} its value {string} data{string}")
	public void i_select_the_supplier_with_its_value_data(String ltype, String lvalue, String testdata) throws Throwable {
		Thread.sleep(2000);
		FunctionLibrary.dropDownAction(ltype, lvalue, testdata);
	}

	@When("i capture the stock number with {string} its value {string}")
	public void i_capture_the_stock_number_with_its_value(String Ltype, String Lvalue) throws Throwable {
		FunctionLibrary.captureStock(Ltype, Lvalue);
	}

	@When("i enter the stock name with {string} its value {string} data{string}")
	public void i_enter_the_stock_name_with_its_value_data(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i select the unit of mesurement with {string} its value {string} data{string}")
	public void i_select_the_unit_of_mesurement_with_its_value_data(String ltype, String lvalue, String testdata) throws Throwable {
		Thread.sleep(2000);
		FunctionLibrary.dropDownAction(ltype, lvalue, testdata);
	}

	@When("i enter the purchasing price with {string} its value {string} data{string}")
	public void i_enter_the_purchasing_price_with_its_value_data(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the selling price with {string} its value {string} data{string}")
	public void i_enter_the_selling_price_with_its_value_data(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@When("i enter the notes with {string} its value {string} data{string}")
	public void i_enter_the_notes_with_its_value_data(String ltype, String lvalue, String testdata) {
		FunctionLibrary.typeAction(ltype, lvalue, testdata);
	}

	@Then("i verify the stock item table")
	public void i_verify_the_stock_item_table() throws Throwable {
		FunctionLibrary.stockTable();
	}



}
