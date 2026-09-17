// DATA PERJALANAN
let jarak = 100;
let efisiensi = 10;
let harga = 10000;
let jenis = 2;

// MENENTUKAN TOTAL JARAK
let totalJarak;

if (jenis === 1) {
    totalJarak = jarak;
} else {
    totalJarak = jarak * 2;
}

// MENENTUKAN KONSUMSI BBM
let konsumsi = totalJarak / efisiensi;

// MENGHITUNG TOTAL BIAYA
let totalBiaya = konsumsi * harga;

// HASIL
console.log('=== HASIL PERHITUNGAN ===');
console.log('Total jarak', totalJarak, 'km');
console.log('konsumsi BBM', konsumsi, 'liter');
console.log('Total biaya BBM: RP' + totalBiaya);