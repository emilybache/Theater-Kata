Kata Theater
============

You work for a theater, and you're working on a suggestion system 
for seat allocations. During the process of buying tickets,
the customer is offered the best seats available in a given
price range. They will be shown a diagram of the theater with
all the available seats shown, and the suggested seats highlighted.
The customer will be able to change to different seats as they wish.
 
You do not need to write the code to display the theater layout
with the suggested seats highlighted. You just have to write the
code that decides which seats to suggest.
 
You have access to a json file with all the seats in the theater
and that also lists which are already booked.
 
Offer seats following these rules:
 
 - do not offer any seat that is already booked by another customer
 - offer seats nearer the middle of a row
 - offer seats nearer the front
 - if possible, offer adjacent seats to members of the same party
 - parties of over 6 can be split into groups that sit together,
with at least 2 in each group.
 - avoid leaving single seats unbooked on a row.
 - as a last resort, offer seats that are not adjacent.