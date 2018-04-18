#You are given a list of projects and a list of dependencies (which is a list of pairs of
#projects, where the second project is dependent on the first project). All of a project's dependencies
#must be built before the project is. Find a build order that will allow the projects to be built. If there
#is no valid build order, return an error.

#input: projects: a, b, c, d, e, f
#       dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
#output: f, e, a, b, d, c

def calculateDependencies(projects, depdencies):
    result = findEndNodes(depdencies)
    dependencygraph = result[0]
    freefloaters = result[1]
    buildOrder = freefloaters

    return 0

def findEndNodes(depencies):
    dependencygraph = []
    for key in depencies.keys():
        if dependencygraph[depencies[key]] is not None:
            dependencygraph[depencies[key]].append(key)
        else:
            dependencygraph[depencies[key]] = [key]
    freeFloaters = []
    for key in dependencygraph:
        if(dependencygraph[key].__len__() == 0 ):
            freeFloaters.append(key)
    return [dependencygraph, freeFloaters]

projects = ['a','b','c','d','e','f']
dependencies = {'a':'d', 'f':'b','b':'d','f':'a','d':'c'}
answer = ['f','e','a','b','d','c']
order = calculateDependencies(projects, dependencies)
print(order == answer)



