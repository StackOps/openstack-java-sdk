package org.openstack.model.compute.server.action;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="removeFloatingIp")
@XmlAccessorType(XmlAccessType.NONE)
public class RemoveFloatingIpAction implements Serializable {

	@XmlAttribute
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
