////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.JposConst;
import jpos.JposException;
import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceLoader;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in FiscalPrinterTest.
 *
 */
public final class FiscalPrinterTestService110 implements jpos.services.FiscalPrinterService110, JposServiceInstance {
    
    private JposEntry configuration;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1011000;
        else
            return 1010000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        configuration = JposServiceLoader.getManager().getEntryRegistry().getJposEntry(logicalName);
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }

    
    @Override
    public int getActualCurrency() throws JposException {
        return 0;
    }
    
    @Override
    public String getAdditionalHeader() throws JposException {
        return "";
    }
    
    @Override
    public void setAdditionalHeader(String additionalHeader) throws JposException {
    }
    
    @Override
    public String getAdditionalTrailer() throws JposException {
        return "";
    }
    
    @Override
    public void setAdditionalTrailer(String additionalTrailer) throws JposException {
    }
    
    @Override
    public int getAmountDecimalPlace() throws JposException {
        return 0;
    }
    
    @Override
    public int getAmountDecimalPlaces() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getAsyncMode() throws JposException {
        return true;
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
    }
    
    @Override
    public boolean getCapAdditionalHeader() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAdditionalLines() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAdditionalTrailer() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAmountAdjustment() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAmountNotPaid() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapChangeDue() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCheckTotal() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCoverSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDoubleWidth() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDuplicateReceipt() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapEmptyReceiptIsVoidable() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapFiscalReceiptStation() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapFiscalReceiptType() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapFixedOutput() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapHasVatTable() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapIndependentHeader() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapItemList() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnNearEndSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnPresent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapMultiContractor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapNonFiscalMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapOnlyVoidLastItem() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapOrderAdjustmentFirst() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPackageAdjustment() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPercentAdjustment() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPositiveAdjustment() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPostPreLine() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPowerLossReport() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapPredefinedPaymentLines() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecNearEndSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecPresent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapReceiptNotPaid() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRemainingFiscalMemory() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapReservedWord() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetCurrency() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetHeader() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetPOSID() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetStoreFiscalID() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetTrailer() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetVatTable() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpFiscalDocument() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpFullSlip() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpNearEndSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpPresent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpValidation() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSubAmountAdjustment() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSubPercentAdjustment() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSubtotal() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTotalizerType() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTrainingMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapValidateJournal() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapXReport() throws JposException {
        return true;
    }
    
    @Override
    public String getChangeDue() throws JposException {
        return "";
    }
    
    @Override
    public void setChangeDue(String changeDue) throws JposException {
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public boolean getCheckTotal() throws JposException {
        return true;
    }
    
    @Override
    public void setCheckTotal(boolean checkTotal) throws JposException {
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public int getContractorId() throws JposException {
        return 0;
    }
    
    @Override
    public void setContractorId(int contractorId) throws JposException {
    }
    
    @Override
    public int getCountryCode() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCoverOpen() throws JposException {
        return true;
    }
    
    @Override
    public int getDateType() throws JposException {
        return 0;
    }
    
    @Override
    public void setDateType(int dateType) throws JposException {
    }
    
    @Override
    public boolean getDayOpened() throws JposException {
        return true;
    }
    
    @Override
    public int getDescriptionLength() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public boolean getDuplicateReceipt() throws JposException {
        return true;
    }
    
    @Override
    public void setDuplicateReceipt(boolean duplicateReceipt) throws JposException {
    }
    
    @Override
    public int getErrorLevel() throws JposException {
        return 0;
    }
    
    @Override
    public int getErrorOutID() throws JposException {
        return 0;
    }
    
    @Override
    public int getErrorState() throws JposException {
        return 0;
    }
    
    @Override
    public int getErrorStation() throws JposException {
        return 0;
    }
    
    @Override
    public String getErrorString() throws JposException {
        return "";
    }
    
    @Override
    public int getFiscalReceiptStation() throws JposException {
        return 0;
    }
    
    @Override
    public void setFiscalReceiptStation(int fiscalReceiptStation) throws JposException {
    }
    
    @Override
    public int getFiscalReceiptType() throws JposException {
        return 0;
    }
    
    @Override
    public void setFiscalReceiptType(int fiscalReceiptType) throws JposException {
    }
    
    @Override
    public boolean getFlagWhenIdle() throws JposException {
        return true;
    }
    
    @Override
    public void setFlagWhenIdle(boolean flagWhenIdle) throws JposException {
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public boolean getJrnEmpty() throws JposException {
        return true;
    }
    
    @Override
    public boolean getJrnNearEnd() throws JposException {
        return true;
    }
    
    @Override
    public int getMessageLength() throws JposException {
        return 0;
    }
    
    @Override
    public int getMessageType() throws JposException {
        return 0;
    }
    
    @Override
    public void setMessageType(int messageType) throws JposException {
    }
    
    @Override
    public int getNumHeaderLines() throws JposException {
        return 0;
    }
    
    @Override
    public int getNumTrailerLines() throws JposException {
        return 0;
    }
    
    @Override
    public int getNumVatRates() throws JposException {
        return 0;
    }
    
    @Override
    public int getOutputID() throws JposException {
        return 0;
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        return "";
    }
    
    @Override
    public String getPostLine() throws JposException {
        return "";
    }
    
    @Override
    public void setPostLine(String postLine) throws JposException {
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
    }
    
    @Override
    public int getPowerState() throws JposException {
        return 0;
    }
    
    @Override
    public String getPreLine() throws JposException {
        return "";
    }
    
    @Override
    public void setPreLine(String preLine) throws JposException {
    }
    
    @Override
    public String getPredefinedPaymentLines() throws JposException {
        return "";
    }
    
    @Override
    public int getPrinterState() throws JposException {
        return 0;
    }
    
    @Override
    public int getQuantityDecimalPlaces() throws JposException {
        return 0;
    }
    
    @Override
    public int getQuantityLength() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getRecEmpty() throws JposException {
        return true;
    }
    
    @Override
    public boolean getRecNearEnd() throws JposException {
        return true;
    }
    
    @Override
    public int getRemainingFiscalMemory() throws JposException {
        return 0;
    }
    
    @Override
    public String getReservedWord() throws JposException {
        return "";
    }
    
    @Override
    public int getSlipSelection() throws JposException {
        return 0;
    }
    
    @Override
    public void setSlipSelection(int slipSelection) throws JposException {
    }
    
    @Override
    public boolean getSlpEmpty() throws JposException {
        return true;
    }
    
    @Override
    public boolean getSlpNearEnd() throws JposException {
        return true;
    }
    
    @Override
    public int getTotalizerType() throws JposException {
        return 0;
    }
    
    @Override
    public void setTotalizerType(int totalizerType) throws JposException {
    }
    
    @Override
    public boolean getTrainingModeActive() throws JposException {
        return true;
    }
    
    @Override
    public void beginFiscalDocument(int documentAmount) throws JposException 
    {
    }
    
    @Override
    public void beginFiscalReceipt(boolean printHeader) throws JposException 
    {
    }
    
    @Override
    public void beginFixedOutput(int station, int documentType) throws JposException 
    {
    }
    
    @Override
    public void beginInsertion(int timeout) throws JposException 
    {
    }
    
    @Override
    public void beginItemList(int vatID) throws JposException 
    {
    }
    
    @Override
    public void beginNonFiscal() throws JposException 
    {
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
    }
    
    @Override
    public void beginTraining() throws JposException 
    {
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
    }
    
    @Override
    public void clearError() throws JposException 
    {
    }
    
    @Override
    public void clearOutput() throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void endFiscalDocument() throws JposException 
    {
    }
    
    @Override
    public void endFiscalReceipt(boolean printHeader) throws JposException 
    {
    }
    
    @Override
    public void endFixedOutput() throws JposException 
    {
    }
    
    @Override
    public void endInsertion() throws JposException 
    {
    }
    
    @Override
    public void endItemList() throws JposException 
    {
    }
    
    @Override
    public void endNonFiscal() throws JposException 
    {
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
    }
    
    @Override
    public void endTraining() throws JposException 
    {
    }
    
    @Override
    public void getData(int dataItem, int[] optArgs, String[] data) throws JposException 
    {
    }
    
    @Override
    public void getDate(String[] Date) throws JposException 
    {
    }
    
    @Override
    public void getTotalizer(int vatID, int optArgs, String[] data) throws JposException 
    {
    }
    
    @Override
    public void getVatEntry(int vatID, int optArgs, int[] vatRate) throws JposException 
    {
    }
    
    @Override
    public void printDuplicateReceipt() throws JposException 
    {
    }
    
    @Override
    public void printFiscalDocumentLine(String documentLine) throws JposException 
    {
    }
    
    @Override
    public void printFixedOutput(int documentType, int lineNumber, String data) throws JposException 
    {
    }
    
    @Override
    public void printNormal(int station, String data) throws JposException 
    {
    }
    
    @Override
    public void printPeriodicTotalsReport(String date1, String date2) throws JposException 
    {
    }
    
    @Override
    public void printPowerLossReport() throws JposException 
    {
    }
    
    @Override
    public void printRecCash(long amount) throws JposException 
    {
    }
    
    @Override
    public void printRecItem(String description, long price, int quantity, int vatInfo, long unitPrice, String unitName) throws JposException 
    {
    }
    
    @Override
    public void printRecItemAdjustment(int adjustmentType, String description, long amount, int vatInfo) throws JposException 
    {
    }
    
    @Override
    public void printRecItemFuel(String description, long price, int quantity, int vatInfo, long unitPrice, String unitName, long specialTax, String specialTaxName) throws JposException 
    {
    }
    
    @Override
    public void printRecItemFuelVoid(String description, long price, int vatInfo, long specialTax) throws JposException 
    {
    }
    
    @Override
    public void printRecMessage(String message) throws JposException 
    {
    }
    
    @Override
    public void printRecNotPaid(String description, long amount) throws JposException 
    {
    }
    
    @Override
    public void printRecPackageAdjustVoid(int adjustmentType, String vatAdjustment) throws JposException 
    {
    }
    
    @Override
    public void printRecPackageAdjustment(int adjustmentType, String description, String vatAdjustment) throws JposException 
    {
    }
    
    @Override
    public void printRecRefund(String description, long amount, int vatInfo) throws JposException 
    {
    }
    
    @Override
    public void printRecRefundVoid(String description, long amount, int vatInfo) throws JposException 
    {
    }
    
    @Override
    public void printRecSubtotal(long amount) throws JposException 
    {
    }
    
    @Override
    public void printRecSubtotalAdjustVoid(int adjustmentType, long amount) throws JposException 
    {
    }
    
    @Override
    public void printRecSubtotalAdjustment(int adjustmentType, String description, long amount) throws JposException 
    {
    }
    
    @Override
    public void printRecTaxID(String taxID) throws JposException 
    {
    }
    
    @Override
    public void printRecTotal(long total, long payment, String description) throws JposException 
    {
    }
    
    @Override
    public void printRecVoid(String description) throws JposException 
    {
    }
    
    @Override
    public void printRecVoidItem(String description, long amount, int quantity, int adjustmentType, long adjustment, int vatInfo) throws JposException 
    {
    }
    
    @Override
    public void printReport(int reportType, String startNum, String endNum) throws JposException 
    {
    }
    
    @Override
    public void printXReport() throws JposException 
    {
    }
    
    @Override
    public void printZReport() throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void resetPrinter() throws JposException 
    {
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void setCurrency(int newCurrency) throws JposException 
    {
    }
    
    @Override
    public void setDate(String date) throws JposException 
    {
    }
    
    @Override
    public void setHeaderLine(int lineNumber, String text, boolean doubleWidth) throws JposException 
    {
    }
    
    @Override
    public void setPOSID(String POSID, String cashierID) throws JposException 
    {
    }
    
    @Override
    public void setStoreFiscalID(String ID) throws JposException 
    {
    }
    
    @Override
    public void setTrailerLine(int lineNumber, String text, boolean doubleWidth) throws JposException 
    {
    }
    
    @Override
    public void setVatTable() throws JposException 
    {
    }
    
    @Override
    public void setVatValue(int vatID, String vatValue) throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void verifyItem(String itemName, int vatID) throws JposException 
    {
    }
}
