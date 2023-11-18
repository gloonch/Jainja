package com.loonch.jainja.model;

import com.mongodb.lang.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Document("property")
public class Property {

    @Id
    private String id;

    @Reference(to = User.class)
    @Indexed(unique = true)
    private User host;

    @Field(name = "type")
    private String type;

    @Nullable // TODO: implement in phase 2
    @Reference(to = PropertyDetails.class)
    private PropertyDetails propertyDetail;

    @Field(name = "description")
    private String description;

    @Field(name = "price")
    private BigDecimal price;

    @Nullable // TODO: implement in phase 2
    @Field(name = "available_dates")
    private List<Date> availableDates;

    @Nullable // TODO: implement in phase 2
    @Field(name = "reserved_dates")
    private List<Date> reservedDates;

    @Nullable // TODO: implement in phase 2
    @Reference(to = PropertyFeatures.class)
    private PropertyFeatures features;

    @Nullable // TODO: implement in phase 2 (make it a geolocation field)
    @Field(name = "location")
    private String location;

    @Nullable // TODO: implement in phase 2
    @Reference(to = PropertyRules.class)
    private PropertyRules rules;

    @Nullable // TODO: implement in phase 2
    @Reference(to = PropertyComments.class)
    private List<PropertyComments> comments;

    public Property() {
    }

    public Property(String id, User host, String type, @Nullable PropertyDetails propertyDetail, String description, BigDecimal price, List<Date> availableDates, List<Date> reservedDates, @Nullable PropertyFeatures features, @Nullable String location, @Nullable PropertyRules rules, @Nullable List<PropertyComments> comments) {
        this.id = id;
        this.host = host;
        this.type = type;
        this.propertyDetail = propertyDetail;
        this.description = description;
        this.price = price;
        this.availableDates = availableDates;
        this.reservedDates = reservedDates;
        this.features = features;
        this.location = location;
        this.rules = rules;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Nullable
    public PropertyDetails getPropertyDetail() {
        return propertyDetail;
    }

    public void setPropertyDetail(@Nullable PropertyDetails propertyDetail) {
        this.propertyDetail = propertyDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Date> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<Date> availableDates) {
        this.availableDates = availableDates;
    }

    public List<Date> getReservedDates() {
        return reservedDates;
    }

    public void setReservedDates(List<Date> reservedDates) {
        this.reservedDates = reservedDates;
    }

    @Nullable
    public PropertyFeatures getFeatures() {
        return features;
    }

    public void setFeatures(@Nullable PropertyFeatures features) {
        this.features = features;
    }

    @Nullable
    public String getLocation() {
        return location;
    }

    public void setLocation(@Nullable String location) {
        this.location = location;
    }

    @Nullable
    public PropertyRules getRules() {
        return rules;
    }

    public void setRules(@Nullable PropertyRules rules) {
        this.rules = rules;
    }

    @Nullable
    public List<PropertyComments> getComments() {
        return comments;
    }

    public void setComments(@Nullable List<PropertyComments> comments) {
        this.comments = comments;
    }
}
