const crypto = require('crypto');

// Function to create a SHA-256 hash
function hash(input) {
    return crypto.createHash('sha256').update(input).digest('hex');
}

// Function to create a digital signature
function createDigitalSignature(message, privateKey) {
    const messageHash = hash(message); // Ensure hash is defined
    const sign = crypto.sign("sha256", Buffer.from(messageHash), { 
        key: privateKey, 
        padding: crypto.constants.RSA_PKCS1_PADDING 
    });
    return sign.toString('hex');
}

// Example usage
const privateKey = `
-----BEGIN PRIVATE KEY-----
YOUR_BASE64_ENCODED_PRIVATE_KEY
-----END PRIVATE KEY-----
`;

const message = "Important Message";
const digitalSignature = createDigitalSignature(message, privateKey);
console.log(`Digital Signature: ${digitalSignature}`);
