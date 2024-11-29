<?php
$servername = "localhost";
$username = "if0_37803682";
$password = "gq82tPAser5w36p";
$dbname = "rimbarayazoo"; 

// Membuat koneksi
$conn = new mysqli($servername, $username, $password, $dbname);

// Memeriksa koneksi
if ($conn->connect_error) {
    die("Koneksi gagal: " . $conn->connect_error);
}
?>