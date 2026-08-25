# Write your MySQL query statement below
select v.customer_id, count(v.visit_id) count_no_trans
from
Visits as v 
LEFT JOIN Transactions as t
on v.visit_id=t.visit_id
where t.amount is null
GROUP BY v.customer_id;