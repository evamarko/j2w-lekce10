[#ftl]

[@c.page title="Seznam studentů"]
    <h1>Seznam studentů</h1>
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
                <td>${student.trida}</td>
                <td><a href="/student/${student.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
