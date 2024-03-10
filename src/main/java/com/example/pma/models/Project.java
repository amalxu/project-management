package com.example.pma.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
// import java.time.LocalDate;

@Entity
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

 
  private String description;

  // private LocalDate startDate;

  // private LocalDate endDate;

  // private String status;

  // private Integer priority;

  // private String assignedTo;

  // private String notes;

  public void setName(String name) {
    this.name = name;
}
public String getName() {
    return name;
}

// Getters and setters for description
public void setDescription(String description) {
    this.description = description;
}
public String getDescription() {
    return description;
}

}
