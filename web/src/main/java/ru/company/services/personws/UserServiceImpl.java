
package ru.company.services.personws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserServiceImpl", targetNamespace = "http://personws.services.company.ru/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserServiceImpl {


    /**
     * 
     * @param userUpdateRequest
     * @return
     *     returns ru.company.services.personws.TUserUpdateResponse
     */
    @WebMethod
    @WebResult(name = "userUpdateResponse", targetNamespace = "")
    @RequestWrapper(localName = "userUpdate", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserUpdate")
    @ResponseWrapper(localName = "userUpdateResponse", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserUpdateResponse")
    @Action(input = "http://personws.services.company.ru/UserServiceImpl/userUpdateRequest", output = "http://personws.services.company.ru/UserServiceImpl/userUpdateResponse")
    public TUserUpdateResponse userUpdate(
        @WebParam(name = "userUpdateRequest", targetNamespace = "")
        TUserUpdateRequest userUpdateRequest);

    /**
     * 
     * @param userDeleteRequest
     * @return
     *     returns ru.company.services.personws.TUserDeleteResponse
     */
    @WebMethod
    @WebResult(name = "userDeleteResponse", targetNamespace = "")
    @RequestWrapper(localName = "userDelete", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserDelete")
    @ResponseWrapper(localName = "userDeleteResponse", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserDeleteResponse")
    @Action(input = "http://personws.services.company.ru/UserServiceImpl/userDeleteRequest", output = "http://personws.services.company.ru/UserServiceImpl/userDeleteResponse")
    public TUserDeleteResponse userDelete(
        @WebParam(name = "userDeleteRequest", targetNamespace = "")
        TUserDeleteRequest userDeleteRequest);

    /**
     * 
     * @param userRequest
     * @return
     *     returns ru.company.services.personws.TUserListResponse
     */
    @WebMethod
    @WebResult(name = "userListResponse", targetNamespace = "")
    @RequestWrapper(localName = "userGetList", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserGetList")
    @ResponseWrapper(localName = "userGetListResponse", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserGetListResponse")
    @Action(input = "http://personws.services.company.ru/UserServiceImpl/userGetListRequest", output = "http://personws.services.company.ru/UserServiceImpl/userGetListResponse")
    public TUserListResponse userGetList(
        @WebParam(name = "userRequest", targetNamespace = "")
        TUserListRequest userRequest);

    /**
     * 
     * @param userCreateRequest
     * @return
     *     returns ru.company.services.personws.TUserCreateResponse
     */
    @WebMethod
    @WebResult(name = "userCreateResponse", targetNamespace = "")
    @RequestWrapper(localName = "userCreate", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserCreate")
    @ResponseWrapper(localName = "userCreateResponse", targetNamespace = "http://personws.services.company.ru/", className = "ru.company.services.personws.UserCreateResponse")
    @Action(input = "http://personws.services.company.ru/UserServiceImpl/userCreateRequest", output = "http://personws.services.company.ru/UserServiceImpl/userCreateResponse")
    public TUserCreateResponse userCreate(
        @WebParam(name = "userCreateRequest", targetNamespace = "")
        TUserCreateRequest userCreateRequest);

}
