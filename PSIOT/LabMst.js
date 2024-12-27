const crypto = require('crypto');

// Function to create a SHA-256 hash
function hash(input) {
    return crypto.createHash('sha256').update(input).digest('hex');
}

// Example usage
const inputData = "Hello, World!";
const hashedData = hash(inputData);
console.log(`Input: ${inputData}`);
console.log(`SHA-256 Hash: ${hashedData}`);
