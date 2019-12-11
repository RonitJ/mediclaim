package com.strikers.mediclaim.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "policy_claim")
public class PolicyClaim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer policyClaimId;
	@GeneratedValue(generator = "REF")
	@GenericGenerator(name = "REF", strategy = "REF1000")
	private Integer referenceNumber;
	private String name;
	private String policyNumber;
	private String diagnosis;
	private LocalDate admissionDate;
	private LocalDate dischargeDate;
	private Double claimAmount;
	private Integer hospitalId;
	private String dischargeSummary;
	private String natureOfAilment;
	private String claimStatus;
	private LocalDate createdDate;
}
