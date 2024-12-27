const crypto = require('crypto');

// Function to create a SHA-256 hash
function hash(input) {
    return crypto.createHash('sha256').update(input).digest('hex');
}

// Function to store a password by hashing it
function storePassword(password) {
    const hashedPassword = hash(password);
    console.log(`Stored Password Hash: ${hashedPassword}`);
}

// Example usage
storePassword("mySecurePassword123");



function generateRandomNumber(seed) {
    const randomString = `${seed}-${Date.now()}`;
    const hashValue = hash(randomString); // Ensure hash is defined
    return parseInt(hashValue.slice(0, 8), 16) % 100; // Random number between 0 and 99
}

