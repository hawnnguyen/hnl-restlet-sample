/**
 * 
 */
package com.hnl.restlet.sample;

/**
 * @author hawnnguyen
 *
 */
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class BaseCampResource extends ServerResource {

  @Get
  public String getResource()  {
    return "Hello World!";
  }
}
