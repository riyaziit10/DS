package com.snapdeal.child;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.snapdeal.api.sro.SubOrderTimelineDetailsDTO;


class status {
	Date date;
    String status;
	
    status(String s, Date d) {
    	this.date = d;
    	this.status=s;
    }
    
    public String toString(){
    	return status + " " + date + "\n";
    }

	public Date getStatusDate() {
		return date;
	}

	public void setStatusDate(Date date) {
		this.date = date;
	}

	public String getStatusCode() {
		return status;
	}

	public void setStatusCode(String status) {
		this.status = status;
	}
	
}

public class Test {
	   	public static  final String OMS_CODE_CRD = "CRD";
	    public static final String SHIPPING_CODE_PWM= "PWM";
	    public static final String SHIPPING_CODE_FFD = "FFD";
	    public static final String SHIPPING_CODE_PFF = "PFF";
	    public static final String RMS_CODE_RPI = "RPI";
	    public static final String RMS_CODE_CCA = "CCA";

		static class TimeLineComparator implements
		Comparator<SubOrderTimelineDetailsDTO> {
	@Override
	public int compare(SubOrderTimelineDetailsDTO o1,
			SubOrderTimelineDetailsDTO o2) {
		if ((o1.getStatusDate().before(o2.getStatusDate()))) {
			return -1;
		} else if (o1.getStatusDate().compareTo(o2.getStatusDate()) == 0) {
			if (RMS_CODE_CCA.equalsIgnoreCase(o1.getStatusCode())
					&& RMS_CODE_RPI.equalsIgnoreCase(o2.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_CCA.equalsIgnoreCase(o1.getStatusCode())
					&& SHIPPING_CODE_FFD.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_CCA.equalsIgnoreCase(o1.getStatusCode())
					&& SHIPPING_CODE_PFF.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_CCA.equalsIgnoreCase(o1.getStatusCode())
					&& SHIPPING_CODE_PWM.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_CCA.equalsIgnoreCase(o1.getStatusCode())
					&& OMS_CODE_CRD.equalsIgnoreCase(o2.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_RPI.equalsIgnoreCase(o1.getStatusCode())
					&& SHIPPING_CODE_FFD.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_RPI.equalsIgnoreCase(o1.getStatusCode())
					&& SHIPPING_CODE_PFF.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_RPI.equalsIgnoreCase(o1.getStatusCode())
					&& SHIPPING_CODE_PWM.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (RMS_CODE_RPI.equalsIgnoreCase(o1.getStatusCode())
					&& OMS_CODE_CRD.equalsIgnoreCase(o2.getStatusCode())) {
				return -1;
			} else if (SHIPPING_CODE_FFD.equalsIgnoreCase(o1.getStatusCode())
					&& SHIPPING_CODE_PFF.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (SHIPPING_CODE_FFD.equalsIgnoreCase(o1
					.getStatusCode())
					&& SHIPPING_CODE_PWM.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (SHIPPING_CODE_FFD.equalsIgnoreCase(o1
					.getStatusCode())
					&& OMS_CODE_CRD.equalsIgnoreCase(o2.getStatusCode())) {
				return -1;
			} else if (SHIPPING_CODE_PFF.equalsIgnoreCase(o1
					.getStatusCode())
					&& SHIPPING_CODE_PWM.equalsIgnoreCase(o2
							.getStatusCode())) {
				return -1;
			} else if (SHIPPING_CODE_PFF.equalsIgnoreCase(o1
					.getStatusCode())
					&& OMS_CODE_CRD.equalsIgnoreCase(o2.getStatusCode())) {
				return -1;
			} else if (SHIPPING_CODE_PWM.equalsIgnoreCase(o1
					.getStatusCode())
					&& OMS_CODE_CRD.equalsIgnoreCase(o2.getStatusCode())) {
				return -1;
			} else
				return 1;
		} else
			return 1;
	};
	    public static void main(String args[]) throws ParseException {
	    	List<status> statusList = new ArrayList<status>();
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	    	statusList.add(new status(OMS_CODE_CRD, sdf.parse("2014-07-02 17:28:31")));
	    	statusList.add(new status("INI", sdf.parse("2014-07-02 17:19:25")));
	    	statusList.add(new status("WFF", sdf.parse("2014-07-02 17:28:29")));
	    	statusList.add(new status(SHIPPING_CODE_PWM,sdf.parse("2014-07-02 17:28:31")));
	    	statusList.add(new status("CLD",sdf.parse("2014-07-02 17:52:46")));
	    	Collections.sort(statusList, new  TimeLineComparator());
	    	
	    	System.out.println(statusList);
		
	}

}
