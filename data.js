var url = "mongodb://127.0.0.1:27017/data_person_info";
var db = connect(url);

db.name.insert([{
    "name": "Sally",
    "age": 28,
    "gender": "female",
    "friend": ObjectId("5c9b18e87c2a03b843f51d1a")
  },{
    "name": "Jenny",
    "age": 29,
    "gender": "female",
    "friend": ObjectId("5c9b18e87c2a03b843f51d1a")
  }]);
