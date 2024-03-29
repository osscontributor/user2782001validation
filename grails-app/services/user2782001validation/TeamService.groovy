package user2782001validation

import grails.gorm.services.Service

@Service(Team)
interface TeamService {

    Team get(Serializable id)

    List<Team> list(Map args)

    Long count()

    void delete(Serializable id)

    Team save(Team team)

}