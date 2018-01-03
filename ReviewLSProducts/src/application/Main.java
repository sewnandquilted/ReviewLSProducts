package application;

// TODO FXML is not currently used (couldn't install scenebuilder)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.CharBuffer;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.LayoutFocusTraversalPolicy;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import application.model.LSProduct;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Main extends Application {

	static ObservableList<LSProduct> lsProductEntries = FXCollections.observableArrayList();
	static ObservableList<LSProduct> lsProductUpdates = FXCollections.observableArrayList();
	static ListView<LSProduct> lsProductList = new ListView<LSProduct>();

	private TableView<LSProduct> table = new TableView();
	final HBox hb = new HBox();
	String productHeader=null;


	@Override
	public void start(Stage primaryStage) throws IOException {

		// populateLsProducts();

		try {

			Scene scene = new Scene(new Group(), 800, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Table View Sample");
			primaryStage.setWidth(1600);
			primaryStage.setHeight(1000);

			final Label label = new Label("Sewn and Quilted Products");
			label.setFont(new Font("Arial", 12));

			table.setEditable(true);

			TableColumn InternalIDCol = new TableColumn("InternalID");
			TableColumn CategoryIDsCol = new TableColumn("CategoryIDs");
			TableColumn DeptCodeCol = new TableColumn("DeptCode");
			TableColumn StatusCol = new TableColumn("Status");
			TableColumn ProductTitleCol = new TableColumn("ProductTitle");
			TableColumn ShortDescriptionCol = new TableColumn("ShortDescription");
			TableColumn LongDescriptionCol = new TableColumn("LongDescription");
			TableColumn UnitOfMeasurementCol = new TableColumn("UnitOfMeasurement");
			TableColumn AvailabilityCol = new TableColumn("Availability");
			TableColumn UnlimitedInventoryCol = new TableColumn("UnlimitedInventory");
			TableColumn OptionsCol = new TableColumn("Options");
			TableColumn AssignedOptionValuesCol = new TableColumn("AssignedOptionValues");
			TableColumn OptionIDCol = new TableColumn("OptionID");
			TableColumn skuCol = new TableColumn("sku");
			TableColumn upcCol = new TableColumn("upc");
			TableColumn ManufacturerProductIdCol = new TableColumn("ManufacturerProductId");
			TableColumn AlternateLookupsCol = new TableColumn("AlternateLookups");
			TableColumn ManufacturerIdCol = new TableColumn("ManufacturerId");
			TableColumn PrimaryVendorCol = new TableColumn("PrimaryVendor");
			TableColumn StoreLocationIDCol = new TableColumn("StoreLocationID");
			TableColumn WeightCol = new TableColumn("Weight");
			TableColumn DefaultCostCol = new TableColumn("DefaultCost");
			TableColumn PriceCol = new TableColumn("Price");
			TableColumn SalePriceCol = new TableColumn("SalePrice");
			TableColumn WholesalePriceCol = new TableColumn("WholesalePrice");
			TableColumn WebsitePriceCol = new TableColumn("WebsitePrice");
			TableColumn WebsiteSalePriceCol = new TableColumn("WebsiteSalePrice");
			TableColumn ReorderPointCol = new TableColumn("ReorderPoint");
			TableColumn DesiredStockLevelCol = new TableColumn("DesiredStockLevel");
			TableColumn CaseUnitQtyCol = new TableColumn("CaseUnitQty");
			TableColumn RetailUnitTypeCol = new TableColumn("RetailUnitType");
			TableColumn CaseUnitTypeCol = new TableColumn("CaseUnitType");
			TableColumn TaxCodeCol = new TableColumn("TaxCode");
			TableColumn DateAddedCol = new TableColumn("DateAdded");

			InternalIDCol.setMinWidth(100);
			CategoryIDsCol.setMinWidth(100);
			DeptCodeCol.setMinWidth(100);
			StatusCol.setMinWidth(100);
			ProductTitleCol.setMinWidth(100);
			ShortDescriptionCol.setMinWidth(100);
			LongDescriptionCol.setMinWidth(100);
			UnitOfMeasurementCol.setMinWidth(100);
			AvailabilityCol.setMinWidth(100);
			UnlimitedInventoryCol.setMinWidth(100);
			OptionsCol.setMinWidth(100);
			AssignedOptionValuesCol.setMinWidth(100);
			OptionIDCol.setMinWidth(100);
			skuCol.setMinWidth(100);
			upcCol.setMinWidth(100);
			ManufacturerProductIdCol.setMinWidth(100);
			AlternateLookupsCol.setMinWidth(100);
			ManufacturerIdCol.setMinWidth(100);
			PrimaryVendorCol.setMinWidth(100);
			StoreLocationIDCol.setMinWidth(100);
			WeightCol.setMinWidth(100);
			DefaultCostCol.setMinWidth(100);
			PriceCol.setMinWidth(100);
			SalePriceCol.setMinWidth(100);
			WholesalePriceCol.setMinWidth(100);
			WebsitePriceCol.setMinWidth(100);
			WebsiteSalePriceCol.setMinWidth(100);
			ReorderPointCol.setMinWidth(100);
			DesiredStockLevelCol.setMinWidth(100);
			CaseUnitQtyCol.setMinWidth(100);
			RetailUnitTypeCol.setMinWidth(100);
			CaseUnitTypeCol.setMinWidth(100);
			TaxCodeCol.setMinWidth(100);
			DateAddedCol.setMinWidth(100);

			InternalIDCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("InternalID"));
			// this field is modifiable
			InternalIDCol.setCellFactory(TextFieldTableCell.forTableColumn());
			InternalIDCol.setOnEditCommit(new EventHandler<CellEditEvent<LSProduct, String>>() {
				@Override
				public void handle(CellEditEvent<LSProduct, String> t) {
					((LSProduct) t.getTableView().getItems().get(t.getTablePosition().getRow()))
							.setInternalID(t.getNewValue());
					lsProductUpdates.add(t.getTableView().getItems().get(t.getTablePosition().getRow()));
				}
			});
			CategoryIDsCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("CategoryIDs"));
			DeptCodeCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("DeptCode"));
			StatusCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("Status"));
			ProductTitleCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("ProductTitle"));
			ShortDescriptionCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("ShortDescription"));
			LongDescriptionCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("LongDescription"));
			UnitOfMeasurementCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("UnitOfMeasurement"));
			AvailabilityCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("Availability"));
			UnlimitedInventoryCol
					.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("UnlimitedInventory"));
			OptionsCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("Options"));
			AssignedOptionValuesCol
					.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("AssignedOptionValues"));
			OptionIDCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("OptionID"));
			// this field is modifiable
			skuCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("sku"));
			skuCol.setCellFactory(TextFieldTableCell.forTableColumn());
			skuCol.setOnEditCommit(new EventHandler<CellEditEvent<LSProduct, String>>() {
				@Override
				public void handle(CellEditEvent<LSProduct, String> t) {
					((LSProduct) t.getTableView().getItems().get(t.getTablePosition().getRow()))
							.setSku(t.getNewValue());
					lsProductUpdates.add(t.getTableView().getItems().get(t.getTablePosition().getRow()));
				}
			});
			// this field is modifiable
			upcCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("upc"));
			upcCol.setCellFactory(TextFieldTableCell.forTableColumn());
			upcCol.setOnEditCommit(new EventHandler<CellEditEvent<LSProduct, String>>() {
				@Override
				public void handle(CellEditEvent<LSProduct, String> t) {
					((LSProduct) t.getTableView().getItems().get(t.getTablePosition().getRow()))
							.setUpc(t.getNewValue());
					lsProductUpdates.add(t.getTableView().getItems().get(t.getTablePosition().getRow()));
				}
			});

			ManufacturerProductIdCol
					.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("ManufacturerProductId"));
			AlternateLookupsCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("AlternateLookups"));
			ManufacturerIdCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("ManufacturerId"));
			PrimaryVendorCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("PrimaryVendor"));
			StoreLocationIDCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("StoreLocationID"));
			WeightCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("Weight"));
			DefaultCostCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("DefaultCost"));
			PriceCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("Price"));
			SalePriceCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("SalePrice"));
			WholesalePriceCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("WholesalePrice"));
			WebsitePriceCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("WebsitePrice"));
			WebsiteSalePriceCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("WebsiteSalePrice"));
			ReorderPointCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("ReorderPoint"));
			DesiredStockLevelCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("DesiredStockLevel"));
			CaseUnitQtyCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("CaseUnitQty"));
			RetailUnitTypeCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("RetailUnitType"));
			CaseUnitTypeCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("CaseUnitType"));
			TaxCodeCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("TaxCode"));
			DateAddedCol.setCellValueFactory(new PropertyValueFactory<LSProduct, String>("DateAdded"));
			table.setItems(lsProductEntries);
			table.setMaxWidth(1200);
			table.getColumns().addAll(InternalIDCol, CategoryIDsCol, DeptCodeCol, StatusCol, ProductTitleCol,
					ShortDescriptionCol, LongDescriptionCol, UnitOfMeasurementCol, AvailabilityCol,
					UnlimitedInventoryCol, OptionsCol, AssignedOptionValuesCol, OptionIDCol, skuCol, upcCol,
					ManufacturerProductIdCol, AlternateLookupsCol, ManufacturerIdCol, PrimaryVendorCol,
					StoreLocationIDCol, WeightCol, DefaultCostCol, PriceCol, SalePriceCol, WholesalePriceCol,
					WebsitePriceCol, WebsiteSalePriceCol, ReorderPointCol, DesiredStockLevelCol, CaseUnitQtyCol,
					RetailUnitTypeCol, CaseUnitTypeCol, TaxCodeCol, DateAddedCol);

			table.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2) {
						LSProduct selectedProduct = table.getSelectionModel().getSelectedItem();

						String link; // = "http://sewnandquilted.com.au";
						link = "https://www.sewnandquilted.com.au/module/search_content.htm?form_version=2&showSearchResults=1&search_keyword=hello&image.x=0&image.y=0";
						link = "https://sewnandquilted.rainadmin.com/site-configuration/products/edit-product.php?action=list&productId="
								+ selectedProduct.getInternalID();
						getHostServices().showDocument(link);
						System.out.print(table.getSelectionModel().getSelectedItem().toString() + "  index is ");
						System.out.println(table.getSelectionModel().getSelectedIndex() + ", internal ID is "
								+ selectedProduct.getInternalID());
					}
				}
			});

			final TextField filterField = new TextField();
			filterField.setPromptText("filter the text");
			filterField.setMaxWidth(10 * InternalIDCol.getPrefWidth());

			// 1. Wrap the ObservableList in a FilteredList (initially display all data).
			FilteredList<LSProduct> filteredData = new FilteredList<>(lsProductEntries, p -> true);

			// 2. Set the filter Predicate whenever the filter changes.
			filterField.textProperty().addListener((observable, oldValue, newValue) -> {
				filteredData.setPredicate(LSProduct -> {
					// If filter text is empty, display all persons.
					if (newValue == null || newValue.isEmpty()) {
						return true;
					}

					// Compare short description, sku, and title of every product with filter text.
					String lowerCaseFilter = newValue.toLowerCase();

					if (LSProduct.getShortDescription().toLowerCase().contains(lowerCaseFilter)) {
						return true; // Filter matches first name.
					} else if (LSProduct.getSku().toLowerCase().contains(lowerCaseFilter)) {
						return true; // Filter matches last name.
					} else if (LSProduct.getProductTitle().toLowerCase().contains(lowerCaseFilter)) {
						return true; // Filter matches last name.
					}
					return false; // Does not match.
				});
			});
			// 3. Wrap the FilteredList in a SortedList.
			// SortedList<LSProduct> sortedData = new SortedList<>(filteredData);

			// 4. Bind the SortedList comparator to the TableView comparator.
			// sortedData.comparatorProperty().bind(table.comparatorProperty());

			// 5. Add sorted (and filtered) data to the table.
			table.setItems(filteredData);

			final Button openFileButton = new Button("Open File");
			openFileButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					try {
						populateLsProducts();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});

			final Button saveFileButton = new Button("Save File");
			saveFileButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					try {
						writeExcel();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			final Button exitButton = new Button("Exit");
			exitButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					System.exit(0);
				}
			});

			hb.getChildren().addAll(filterField, openFileButton, saveFileButton, exitButton);
			hb.setSpacing(3);

			final VBox vbox = new VBox();
			vbox.setSpacing(5);
			vbox.setPadding(new Insets(10, 0, 0, 10));
			vbox.getChildren().addAll(label, table, hb);

			((Group) scene.getRoot()).getChildren().addAll(vbox);

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void populateLsProducts() throws IOException {
		System.out.println("open downloaded Product file");
		FileChooser fc = new FileChooser();
		fc.setTitle("Get Text");
		fc.getExtensionFilters().addAll(new ExtensionFilter("CSV Files", "*.csv"));
		File lsProductFile = fc.showOpenDialog(null);

		File file = new File(lsProductFile.getAbsolutePath().toString());
		Scanner input = new Scanner(file);

		if (input.hasNextLine()) {
		    productHeader = input.nextLine();
		}		
		input.close();
		System.out.println("productHeader is :" + productHeader + ":");
		
		Reader in = new FileReader(lsProductFile.getAbsolutePath());
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		for (CSVRecord record : records) {
			LSProduct product = new LSProduct();

			product.setInternalID(record.get("Internal ID(Do Not Change)"));
			product.setCategoryIDs(record.get("Category IDs (Comma separate)"));
			product.setDeptCode(record.get("Dept Code"));
			product.setStatus(record.get("Status"));
			product.setProductTitle(record.get("Product Title"));
			product.setShortDescription(record.get("Short Description"));

			// product.setLongDescription(record.get("Long Description"));

			product.setUnitOfMeasurement(record.get("Unit of Measurement(each/per yard)"));
			product.setAvailability(record.get("Availability(web/store/both)"));
			product.setUnlimitedInventory(record.get("Unlimited Inventory(yes/no)"));
			product.setOptions(record.get("Options"));
			product.setAssignedOptionValues(record.get("Assigned option values"));
			product.setOptionID(Integer.parseInt(record.get("Option ID(Do Not Change)")));
			product.setSku(record.get("sku"));
			product.setUpc(record.get("upc"));
			product.setManufacturerProductId(record.get("Manufacturer Product Id"));
			product.setAlternateLookups(record.get("Alternate Lookups"));
			product.setManufacturerId(record.get("Manufacturer Id"));
			product.setPrimaryVendor(record.get("Primary Vendor"));
			product.setStoreLocationID(Integer.parseInt(record.get("Store Location ID")));
			product.setWeight(BigDecimalValue(record.get("Weight")));
			product.setDefaultCost(BigDecimalValue(record.get("Default Cost")));
			product.setPrice(BigDecimalValue(record.get("Price")));
			product.setSalePrice(BigDecimalValue(record.get("Sale Price")));
			product.setWholesalePrice(BigDecimalValue(record.get("Wholesale Price")));
			product.setWebsitePrice(BigDecimalValue(record.get("Website Price")));
			product.setWebsiteSalePrice(BigDecimalValue(record.get("Website Sale Price")));
			product.setReorderPoint(BigDecimalValue(record.get("Re-Order Point")));
			product.setDesiredStockLevel(new BigDecimal(record.get("Desired Stock Level")));
			product.setCaseUnitQty(record.get("Case Unit Qty"));
			product.setRetailUnitType(record.get("Retail Unit Type(items,inches,feet,yards,meters)"));
			product.setCaseUnitType(record.get("Case Unit Type(case,bolt,box,roll,pack)"));
			product.setTaxCode(Integer.parseInt(record.get("Tax Code")));
			product.setDateAdded(record.get("Date Added"));

			lsProductEntries.add(product);
		}

		System.out.println("number of segments loaded into lsProductEntries is " + lsProductEntries.size());

		lsProductList.setItems(lsProductEntries);
	}

	private BigDecimal BigDecimalValue(String string) {
		if (string.isEmpty()) {
			return BigDecimal.ZERO;
		}
		return new BigDecimal(string);
	}

	public void writeExcel() throws Exception {
		Writer writer = null;
		try {
			FileChooser chooser = new FileChooser();
			chooser.setTitle("Choose location To Save data");
			File selectedFile = null;
			selectedFile = chooser.showSaveDialog(null);

			File file = new File(selectedFile.getAbsolutePath());
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(productHeader+ "\n");
			for (LSProduct product : lsProductUpdates) {

				String text = product.getInternalID() + "," + product.getCategoryIDs() + "," + product.getDeptCode()
						+ "," + product.getStatus() + "," + product.getProductTitle() + ","
						+ product.getShortDescription() + "," + product.getLongDescription() + ","
						+ product.getUnitOfMeasurement() + "," + product.getAvailability() + ","
						+ product.getUnlimitedInventory() + "," + product.getOptions() + ","
						+ product.getAssignedOptionValues() + "," + product.getOptionID() + (product.getSku()) + ","
						+ (product.getUpc()) + ","
						+ (product.getManufacturerProductId() + "," + product.getAlternateLookups() + ","
								+ product.getManufacturerId())
						+ "," + product.getPrimaryVendor() + "," + product.getStoreLocationID() + ","
						+ product.getWeight() + "," + product.getDefaultCost() + "," + product.getPrice() + ","
						+ product.getSalePrice() + "," + product.getWholesalePrice() + "," + product.getWebsitePrice()
						+ "," + product.getWebsiteSalePrice() + "," + product.getReorderPoint() + ","
						+ product.getDesiredStockLevel() + "," + product.getCaseUnitQty() + ","
						+ product.getRetailUnitType() + "," + product.getCaseUnitType() + "," + product.getTaxCode()
						+ "," + product.getDateAdded() + "\n";
				writer.write(text);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			writer.flush();
			writer.close();
		}
	}

	private void search(String oldVal, String newVal) {
		if (oldVal != null && (newVal.length() < oldVal.length())) {
			lsProductList.setItems(lsProductEntries);
		}
		String value = newVal.toUpperCase();
		ObservableList<LSProduct> subentries = FXCollections.observableArrayList();
		for (Object entry : lsProductList.getItems()) {
			boolean match = true;
			LSProduct entryText = (LSProduct) entry;
			// TODO add further fields here for searching
			if (!entryText.getShortDescription().toUpperCase().contains(value)) {
				match = false;
				break;
			}
			if (match) {
				subentries.add(entryText);
			}
		}
		lsProductList.setItems(subentries);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
