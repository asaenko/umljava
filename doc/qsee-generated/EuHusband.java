/*--------------------------------------------------------------
  Auto-generated Java code for class EuHusband

  Generated by QSEE-SuperLite multi-CASE, QSEE-Technologies Ltd
  www.qsee-technologies.com
----------------------------------------------------------------*/


public class EuHusband extends Man {

  //--------------------------------------------------------------
  // Attribute Declarations

  public EuWife wife;

  //--------------------------------------------------------------
  // Attributes implementing associations

  private EuWife eu_husband_to_eu_wife = null;


  //--------------------------------------------------------------
  // Accessor Methods

  /** accessor for 'wife' attribute
      @return value of wife  */
  public final EuWife getWife()   {
      return wife;
  }

  /** mutator for 'wife' attribute
      @param newValue The value to assign to wife  */
  public final void setWife (final EuWife newValue)    {
      wife = newValue;
  }


  //--------------------------------------------------------------
  // Accessor Methods implementing access to associated objects

  /** Gets the single 'EuWife' object which is linked via the 'EuHusbandToEuWife' association
      @return A 'EuWife' object (may be null if not set)
  */
  public EuWife getEuHusbandToEuWife()   {
      return eu_husband_to_eu_wife;
  }

  /** Sets the single 'EuWife' object which is linked via the 'EuHusbandToEuWife' association
      @param newObject The 'EuWife' object to be associated with this instance
  */
  public void setEuHusbandToEuWife(EuWife newObject)   {
      eu_husband_to_eu_wife = newObject;
  }





}	// end of EuHusband class definition

