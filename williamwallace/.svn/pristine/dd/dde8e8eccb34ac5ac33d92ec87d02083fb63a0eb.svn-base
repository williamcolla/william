select count(id)
from public.ficha

select count(id)
from public.ficha
where sexo = 'M'

select p.nome
from public.parte_corpo as p, public.ficha as f
where f.num_ordem between '100' and '200'

select count(f.municipio_acidente)
from public.ficha as f
where f.municipio_acidente = '9659' and extract(MONTH FROM f.data_hora_acidente) = 3 and extract(YEAR FROM f.data_hora_acidente) = 2009

select count(f.id) as quantidade, extract(MONTH FROM f.data_hora_acidente) as mes
from public.ficha as f
where extract(YEAR from f.data_hora_acidente) = 2011 and extract(MONTH FROM f.data_hora_acidente) between 1 and 12
group by extract(MONTH FROM f.data_hora_acidente)
order by mes asc

select count(e.id) as empresas
from public.empresa as e
where e.tipo_empregador = 'empresa'

select count(f.empresa_acidente), e.nome 
from public.ficha as f
inner join public.empresa as e on(e.id = f.empresa_acidente)
group by f.empresa_acidente, e.nome
order by count(f.empresa_acidente) desc 
limit 10

--select count(f.ramo_atividade), r.descricao
--from public.filial as f
--inner join public.ramo_atividade as r on(r.id = f.ramo_atividade)
--group by f.ramo_atividade, r.descricao
--order by count(f.ramo_atividade) desc

select count(f.id), r.descricao
from public.ficha as f, public.filial as f1
inner join public.ramo_atividade as r on(r.id = f1.ramo_atividade)
where f1.id_empresa = f.empresa_acidente
group by f.empresa_acidente, r.descricao
order by count(f.id) desc

select count(f.municipio_acidente) as qtd_acidentes, m.nome_oficial as nomes_empresas
from public.ficha as f, public.filial as f1
inner join public.municipio as m on(f1.municipio = m.id_dne)
where f.empresa_acidente = f1.id
group by f.municipio_acidente, m.nome_oficial
order by count(f.municipio_acidente)


select avg(extract(year from age(f.data_nascimento))) as media_idade
from public.ficha as f
where extract(year from f.data_hora_atendimento) = 2010

select count(extract(dow from f.data_hora_atendimento)), extract(dow from f.data_hora_atendimento)
from public.ficha as f
group by extract(dow from f.data_hora_atendimento) 
order by count(extract(dow from f.data_hora_atendimento)) desc
limit 1

select count(f.unidade_notificante), u.descricao
from public.ficha as f
inner join public.unidade_notificante as u on(u.id = f.unidade_notificante)
group by f.unidade_notificante, u.descricao
order by count(f.unidade_notificante) desc
limit 10
