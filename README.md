# Mini Programming Project

## 1. Group Information

**Class:** C  
**Group:** 5

### Group Members

| No. | Name | Student ID | Role |
|---|---|---|---|
| 1 | Kaysan Fadhil Wibwo | 2610312085 | Project Coordinator |
| 2 | Muhamad Fahmi Dawam | 2610312099 | Algorithm |
| 3 | Daffiza Aliya Nurnazila | 2610312083 | Flowchart |
| 4 | Mikhail ramadhan | 2610312096 | JavaScript |
| 5 | Panji Dwicaksana | 2610312097 | Testing & Documentation |

---

## 2. Project Title

Travel Cost Calculator

---

## 3. Project Description

Travel Cost Calculator is an interactive application designed to help users estimate their total travel expenses based on key journey metrics. The program prompts users to input the travel distance in kilometers, vehicle fuel efficiency in kilometers per liter (km/L), and the current price of fuel per liter. It accommodates both one-way and round-trip journeys, automatically calculating the total distance, total estimated fuel consumption, and overall fuel cost. Designed for user convenience, the application outputs complete breakdown results and allows users to seamlessly perform multiple trip calculations in a continuous session without needing to restart the program.

---

## 4. Objectives

The objective of this project is to build a practical **Travel Cost Calculator** while mastering fundamental software development concepts using **JavaScript**. 

Specifically, this project aims to:
- **Implement Core Logic:** Utilize variables, data types, and arithmetic operators to compute fuel consumption and travel costs accurately.
- **Manage Dynamic Trip Types:** Apply **conditional statements** (`if/else` or `switch`) to handle logic for both one-way and round-trip journeys.
- **Enable Continuous Execution:** Incorporate **loops** (`while` or `do-while`) to allow users to calculate multiple trips without restarting the application.
- **Develop Problem-Solving Skills:** Structure clean algorithms to transform raw user inputs into structured, meaningful outputs.

---

## 5. Input

The program receives the following data:

- `jarak` (The distance of the trip)
- `efisiensi` (Fuel efficiency in km/liter)
- `harga` (Fuel price per liter)
- `jenis` (Type of trip: 1 for one-way, other numbers for round-trip)

---

## 6. Process

The program calculates the travel details based on the input variables:

- **Determine Total Distance (`totalJarak`)**: 
  If the trip type (`jenis`) is 1, the total distance is equal to the input distance. Otherwise, the distance is multiplied by 2.
- **Determine Fuel Consumption (`konsumsi`)**: 
  The total distance is divided by the fuel efficiency (`efisiensi`).
- **Calculate Total Cost (`totalBiaya`)**: 
  The calculated fuel consumption is multiplied by the fuel price (`harga`).

---

## 7. Output

The program displays:

- A header: `=== HASIL PERHITUNGAN ===`
- The total calculated distance (in km)
- The total fuel consumption (in liters)
- The total fuel cost (in RP)
---

## 8. Algorithm

The algorithm used in the program is described in:

`pseudocode.txt`

---

## 9. Flowchart

The flowchart is created using Flowgorithm.

File:

`flowchart.fprg`

---

## 10. JavaScript Implementation

The JavaScript implementation of the program is available in:

[app.java](app.java)

---

## 11. Testing

The program is tested using several test scenarios.

Testing documentation:

`test-cases.md`

