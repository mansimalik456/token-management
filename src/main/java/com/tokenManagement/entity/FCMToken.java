package com.tokenManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FCMToken {
	
	private String deviceId;
	
	private String token;
	
	private boolean isActive = true;
	
	@Override
	public boolean equals(Object obj) {
		FCMToken e = null;
	    if(obj instanceof FCMToken){
	        e = (FCMToken) obj;
	    }
	    if(this.token != e.token){
	        e.setToken(token);
	        return true;
	    } else {
	        return false;
	    }  
	}

    @Override
    public int hashCode() {       
        return deviceId.hashCode();
    }

//	public FCMToken(String equalField, String anotherField) {
//	        this.deviceId = equalField;
//	        this.token = anotherField;
//	 }
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		FCMToken other = (FCMToken) obj;
//		//return Objects.equals(deviceId, other.deviceId) && !Objects.equals(token, other.token);
//		 if (deviceId == null) {
//	            if (other.deviceId != null)
//	                return false;
//	        } else if (!deviceId.equals(other.deviceId))
//	            return false;
//	        return true;
//	   }
//	
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//        int result = 1;
//        
//        result = prime * result
//                + ((deviceId == null) ? 0 : deviceId.hashCode());
//        
//    //   return Objects.hash(result);
//        return result;
//	}

	
	
/*	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FCMToken) {
			FCMToken other = (FCMToken) obj;
			return other.deviceId.equals(this.deviceId);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return deviceId.hashCode();
		//return Objects.hash(deviceId);
	} */

	

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		FCMToken other = (FCMToken) obj;
//		return Objects.equals(token, other.token);
//		if (deviceId == null) {
//            if (other.deviceId != null)
//                return false;
//        } else if (!deviceId.equals(other.deviceId))
//            return false;
//        return true;
// 
//	}

//	@Override
//	public int hashCode() {
//		 final int prime = 31;
//	        int result = 1;
//	        result = prime * result
//	                + ((deviceId == null) ? 0 : deviceId.hashCode());
//	    //    result = prime * result + ((token!=null) ? 0 : token.hashCode());
//	        
//	        return result;
//	}


	
//	public boolean add(Object object) {
//		FCMToken newObj = (FCMToken) object;
//		if(Objects.equals(deviceId, newObj.deviceId) && !Objects.equals(token, newObj.token)) {
//			newObj.setDeviceId(newObj.deviceId);
//			newObj.setToken(newObj.token);
//			//return newObj.add(object);
//			return newObj.add(object);
//		}
//		return true;
//	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		FCMToken other = (FCMToken) obj;
////		if(Objects.equals(deviceId, other.deviceId) && Objects.equals(token, other.token)) {
////			other.setDeviceId(other.deviceId);
////			other.setToken(other.token);
////		}
////		return (other.deviceId.equals(this.deviceId) && other.token != this.token);
//		
//		if(deviceId.equals(other.deviceId)) {
//			if(!token.equals(other.token)) {
//				System.out.println("hii");
//				return true;
//			}
//		}
//		return (other.deviceId.equals(deviceId) && other.token != token);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(deviceId, token);
//	}
//		

}
