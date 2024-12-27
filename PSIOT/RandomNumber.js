const crypto = require('crypto');

// Function to create a SHA-256 hash
function hash(input) {
    return crypto.createHash('sha256').update(input).digest('hex');
}

// Function to generate a pseudo-random number
function generateRandomNumber(seed) {
    const randomString = `${seed}-${Date.now()}`;
    const hashValue = hash(randomString); // Ensure hash is defined
    return parseInt(hashValue.slice(0, 8), 16) % 100; // Random number between 0 and 99
}

// Example usage
const seedValue = "Harsh_pandey";
const randomNum = generateRandomNumber(seedValue);
console.log(`Generated Random Number: ${randomNum}`);
