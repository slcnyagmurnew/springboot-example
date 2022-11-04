// db.createUser(
//     {
//         user: "admin",
//         pwd: "admin",
//         roles : [
//             {
//                 role: "readWrite",
//                 db: "todo"
//             }
//         ]
//     }
// )
db = new Mongo().getDB("todo");
db.createCollection('role', { capped: false });
db.role.insertMany([
    { name: "ROLE_USER" },
    { name: "ROLE_MODERATOR" },
    { name: "ROLE_ADMIN" },
]);