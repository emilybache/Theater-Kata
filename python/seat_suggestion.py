import json
 
class SeatFinder:
 
    def __init__(self, theater):
        self.theater = theater
 
    def suggest(self, count):
        return []
 
class Theater:
 
    def __init__(self, rows, seats, booked):
        self.rows = rows
        self.seats = seats
        self.booked = booked
 
def rows_and_seats_from_json(json_text):
    data = json.loads(json_text)
    rows = data["rows"]
    seats = data["seats"]
    return rows, seats
 
def theater_from_json(filename, booked):
    with open(filename) as f:
        rows, seats = rows_and_seats_from_json(f.read())
    return Theater(rows, seats, booked)