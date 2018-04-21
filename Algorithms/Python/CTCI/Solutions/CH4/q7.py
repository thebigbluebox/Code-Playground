# You are given a list of projects and a list of dependencies (which is a list of pairs of
# projects, where the second project is dependent on the first project). All of a project's dependencies
# must be built before the project is. Find a build order that will allow the projects to be built. If there
# is no valid build order, return an error.

# input: projects: a, b, c, d, e, f
#       dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
# output: f, e, a, b, d, c

def calculateDependencies(projects, depdencies):
    result = findEndNodes(projects, depdencies)
    dependencygraph = result[0]
    freefloaters = result[1]
    buildOrder = freefloaters

    return 0


def findEndNodes(projects, depencies):
    dependencygraph = {}
    for dependency in depencies:
        need = dependency[0]
        build = dependency[1]
        if build in dependencygraph:
            dependencygraph[build].append(need)
        else:
            dependencygraph[build] = [need]
    # check if any of the project is not in this list
    freeFloaters = []
    counter = 5
    while counter > 0:
        for project in projects:
            if (project not in dependencygraph.keys()):
                freeFloaters.append(project)
                projects.remove(project)
                for dependency in dependencygraph:
                    if project in dependencygraph[dependency]:
                        dependencygraph[dependency].remove(project)
                    if dependencygraph[dependency].__len__() == 0:
                        freeFloaters.append(dependency)
                        dependencygraph.pop(project, None)
                        projects.remove(dependency)
            else:
                for item in dependencygraph[project]:
                    if item in freeFloaters:
                        dependencygraph[project].remove(item)
                if dependencygraph[project].__len__() == 0:
                    freeFloaters.append(project)
                    dependencygraph.pop(project, None)
                    projects.remove(project)
        counter-=1
    return [dependencygraph, freeFloaters]


projects = ['a', 'b', 'c', 'd', 'e', 'f']
dependencies = [['a', 'd'], ['f', 'b'], ['b', 'd'], ['f', 'a'], ['d', 'c']]
answer = ['f', 'e', 'a', 'b', 'd', 'c']
order = calculateDependencies(projects, dependencies)
print(order == answer)