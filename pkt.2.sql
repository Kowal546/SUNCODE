select * 
from tabela_testowa
where kolumna1 in (select kolumna1
from tabela_testowa
group by kolumna1
having count(*) > 1);
