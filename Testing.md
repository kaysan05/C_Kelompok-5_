# Testing

## Test Case 1: Menghitung Harga Total Berdasarkan Jarak

**Input:**
- Jarak = 10 km
- Efisiensi = 5 km/liter
- Harga bensin = Rp13.000/liter

**Expected Output:**
- Kebutuhan bensin: 2 liter
- Harga total: Rp26.000

**Actual Output:**
- Kebutuhan bensin: 2 liter
- Harga total: Rp26.000

**Status: PASS**

---

## Test Case 2: Jarak Lebih Jauh

**Input:**
- Jarak = 50 km
- Efisiensi = 10 km/liter
- Harga bensin = Rp13.000/liter

**Expected Output:**
- Kebutuhan bensin: 5 liter
- Harga total: Rp65.000

**Actual Output:**
- Kebutuhan bensin: 5 liter
- Harga total: Rp65.000

**Status: PASS**

---

## Test Case 3: Input Jarak Tidak Valid

**Input:**
- Jarak = -10 km

**Expected Output:**
- Input salah! Jarak harus lebih dari 0 km.
- Input diminta ulang.

**Actual Output:**
- Input salah! Jarak harus lebih dari 0 km.
- Input diminta ulang.

**Status: PASS**
