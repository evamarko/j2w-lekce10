[#ftl]

[@c.page title="Rodič ${rodic.jmeno} ${rodic.prijmeni}"]
    <h1>Rodič ${rodic.jmeno} ${rodic.prijmeni}</h1>
    [#if rodic.email??]
        <p>E-mail: ${rodic.email}</p>
    [/#if]
    [#if rodic.telefon??]
        <p>Telefon: ${rodic.telefon}</p>
    [/#if]
    <p></p>
    <h2>Děti:</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">Třída</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list studenti as student]
            <tr>
                <td>${student.jmeno}</td>
                <td>${student.prijmeni}</td>
                <td><a href="/trida/${student.trida.id}">${student.trida}</a></td>
                <td><a href="/student/${student.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
