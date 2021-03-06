package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class XbPersonsRealmProxy extends com.dk.mp.core.entity.XbPersons
    implements RealmObjectProxy, XbPersonsRealmProxyInterface {

    static final class XbPersonsColumnInfo extends ColumnInfo
        implements Cloneable {

        public long prikeyIndex;
        public long idIndex;
        public long nameIndex;
        public long departmentidIndex;
        public long departmentnameIndex;
        public long phonesIndex;
        public long loginnameIndex;

        XbPersonsColumnInfo(String path, Table table) {
            final Map<String, Long> indicesMap = new HashMap<String, Long>(7);
            this.prikeyIndex = getValidColumnIndex(path, table, "XbPersons", "prikey");
            indicesMap.put("prikey", this.prikeyIndex);
            this.idIndex = getValidColumnIndex(path, table, "XbPersons", "id");
            indicesMap.put("id", this.idIndex);
            this.nameIndex = getValidColumnIndex(path, table, "XbPersons", "name");
            indicesMap.put("name", this.nameIndex);
            this.departmentidIndex = getValidColumnIndex(path, table, "XbPersons", "departmentid");
            indicesMap.put("departmentid", this.departmentidIndex);
            this.departmentnameIndex = getValidColumnIndex(path, table, "XbPersons", "departmentname");
            indicesMap.put("departmentname", this.departmentnameIndex);
            this.phonesIndex = getValidColumnIndex(path, table, "XbPersons", "phones");
            indicesMap.put("phones", this.phonesIndex);
            this.loginnameIndex = getValidColumnIndex(path, table, "XbPersons", "loginname");
            indicesMap.put("loginname", this.loginnameIndex);

            setIndicesMap(indicesMap);
        }

        @Override
        public final void copyColumnInfoFrom(ColumnInfo other) {
            final XbPersonsColumnInfo otherInfo = (XbPersonsColumnInfo) other;
            this.prikeyIndex = otherInfo.prikeyIndex;
            this.idIndex = otherInfo.idIndex;
            this.nameIndex = otherInfo.nameIndex;
            this.departmentidIndex = otherInfo.departmentidIndex;
            this.departmentnameIndex = otherInfo.departmentnameIndex;
            this.phonesIndex = otherInfo.phonesIndex;
            this.loginnameIndex = otherInfo.loginnameIndex;

            setIndicesMap(otherInfo.getIndicesMap());
        }

        @Override
        public final XbPersonsColumnInfo clone() {
            return (XbPersonsColumnInfo) super.clone();
        }

    }
    private XbPersonsColumnInfo columnInfo;
    private ProxyState<com.dk.mp.core.entity.XbPersons> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("prikey");
        fieldNames.add("id");
        fieldNames.add("name");
        fieldNames.add("departmentid");
        fieldNames.add("departmentname");
        fieldNames.add("phones");
        fieldNames.add("loginname");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    XbPersonsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (XbPersonsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.dk.mp.core.entity.XbPersons>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$prikey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.prikeyIndex);
    }

    @Override
    public void realmSet$prikey(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'prikey' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$departmentid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.departmentidIndex);
    }

    @Override
    public void realmSet$departmentid(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.departmentidIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.departmentidIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.departmentidIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.departmentidIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$departmentname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.departmentnameIndex);
    }

    @Override
    public void realmSet$departmentname(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.departmentnameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.departmentnameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.departmentnameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.departmentnameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phones() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phonesIndex);
    }

    @Override
    public void realmSet$phones(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phonesIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phonesIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phonesIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phonesIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$loginname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.loginnameIndex);
    }

    @Override
    public void realmSet$loginname(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.loginnameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.loginnameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.loginnameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.loginnameIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("XbPersons")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("XbPersons");
            realmObjectSchema.add("prikey", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("departmentid", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("departmentname", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("phones", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("loginname", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("XbPersons");
    }

    public static XbPersonsColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_XbPersons")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'XbPersons' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_XbPersons");
        final long columnCount = table.getColumnCount();
        if (columnCount != 7) {
            if (columnCount < 7) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 7 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 7 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 7 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final XbPersonsColumnInfo columnInfo = new XbPersonsColumnInfo(sharedRealm.getPath(), table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'prikey' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.prikeyIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field prikey");
            }
        }

        if (!columnTypes.containsKey("prikey")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'prikey' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("prikey") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'prikey' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.prikeyIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'prikey' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("prikey"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'prikey' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'id' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'id' is required. Either set @Required to field 'id' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("name")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("name") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'name' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.nameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'name' is required. Either set @Required to field 'name' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("departmentid")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'departmentid' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("departmentid") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'departmentid' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.departmentidIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'departmentid' is required. Either set @Required to field 'departmentid' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("departmentname")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'departmentname' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("departmentname") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'departmentname' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.departmentnameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'departmentname' is required. Either set @Required to field 'departmentname' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("phones")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'phones' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("phones") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'phones' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.phonesIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'phones' is required. Either set @Required to field 'phones' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("loginname")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'loginname' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("loginname") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'loginname' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.loginnameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'loginname' is required. Either set @Required to field 'loginname' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_XbPersons";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.dk.mp.core.entity.XbPersons createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.dk.mp.core.entity.XbPersons obj = null;
        if (update) {
            Table table = realm.getTable(com.dk.mp.core.entity.XbPersons.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("prikey")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("prikey"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.dk.mp.core.entity.XbPersons.class), false, Collections.<String> emptyList());
                    obj = new io.realm.XbPersonsRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("prikey")) {
                if (json.isNull("prikey")) {
                    obj = (io.realm.XbPersonsRealmProxy) realm.createObjectInternal(com.dk.mp.core.entity.XbPersons.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.XbPersonsRealmProxy) realm.createObjectInternal(com.dk.mp.core.entity.XbPersons.class, json.getString("prikey"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'prikey'.");
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                ((XbPersonsRealmProxyInterface) obj).realmSet$id(null);
            } else {
                ((XbPersonsRealmProxyInterface) obj).realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                ((XbPersonsRealmProxyInterface) obj).realmSet$name(null);
            } else {
                ((XbPersonsRealmProxyInterface) obj).realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("departmentid")) {
            if (json.isNull("departmentid")) {
                ((XbPersonsRealmProxyInterface) obj).realmSet$departmentid(null);
            } else {
                ((XbPersonsRealmProxyInterface) obj).realmSet$departmentid((String) json.getString("departmentid"));
            }
        }
        if (json.has("departmentname")) {
            if (json.isNull("departmentname")) {
                ((XbPersonsRealmProxyInterface) obj).realmSet$departmentname(null);
            } else {
                ((XbPersonsRealmProxyInterface) obj).realmSet$departmentname((String) json.getString("departmentname"));
            }
        }
        if (json.has("phones")) {
            if (json.isNull("phones")) {
                ((XbPersonsRealmProxyInterface) obj).realmSet$phones(null);
            } else {
                ((XbPersonsRealmProxyInterface) obj).realmSet$phones((String) json.getString("phones"));
            }
        }
        if (json.has("loginname")) {
            if (json.isNull("loginname")) {
                ((XbPersonsRealmProxyInterface) obj).realmSet$loginname(null);
            } else {
                ((XbPersonsRealmProxyInterface) obj).realmSet$loginname((String) json.getString("loginname"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.dk.mp.core.entity.XbPersons createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        com.dk.mp.core.entity.XbPersons obj = new com.dk.mp.core.entity.XbPersons();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("prikey")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((XbPersonsRealmProxyInterface) obj).realmSet$prikey(null);
                } else {
                    ((XbPersonsRealmProxyInterface) obj).realmSet$prikey((String) reader.nextString());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((XbPersonsRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((XbPersonsRealmProxyInterface) obj).realmSet$id((String) reader.nextString());
                }
            } else if (name.equals("name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((XbPersonsRealmProxyInterface) obj).realmSet$name(null);
                } else {
                    ((XbPersonsRealmProxyInterface) obj).realmSet$name((String) reader.nextString());
                }
            } else if (name.equals("departmentid")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((XbPersonsRealmProxyInterface) obj).realmSet$departmentid(null);
                } else {
                    ((XbPersonsRealmProxyInterface) obj).realmSet$departmentid((String) reader.nextString());
                }
            } else if (name.equals("departmentname")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((XbPersonsRealmProxyInterface) obj).realmSet$departmentname(null);
                } else {
                    ((XbPersonsRealmProxyInterface) obj).realmSet$departmentname((String) reader.nextString());
                }
            } else if (name.equals("phones")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((XbPersonsRealmProxyInterface) obj).realmSet$phones(null);
                } else {
                    ((XbPersonsRealmProxyInterface) obj).realmSet$phones((String) reader.nextString());
                }
            } else if (name.equals("loginname")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((XbPersonsRealmProxyInterface) obj).realmSet$loginname(null);
                } else {
                    ((XbPersonsRealmProxyInterface) obj).realmSet$loginname((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'prikey'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static com.dk.mp.core.entity.XbPersons copyOrUpdate(Realm realm, com.dk.mp.core.entity.XbPersons object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.dk.mp.core.entity.XbPersons) cachedRealmObject;
        } else {
            com.dk.mp.core.entity.XbPersons realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.dk.mp.core.entity.XbPersons.class);
                long pkColumnIndex = table.getPrimaryKey();
                String value = ((XbPersonsRealmProxyInterface) object).realmGet$prikey();
                long rowIndex = Table.NO_MATCH;
                if (value == null) {
                    rowIndex = table.findFirstNull(pkColumnIndex);
                } else {
                    rowIndex = table.findFirstString(pkColumnIndex, value);
                }
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.dk.mp.core.entity.XbPersons.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.XbPersonsRealmProxy();
                        cache.put(object, (RealmObjectProxy) realmObject);
                    } finally {
                        objectContext.clear();
                    }
                } else {
                    canUpdate = false;
                }
            }

            if (canUpdate) {
                return update(realm, realmObject, object, cache);
            } else {
                return copy(realm, object, update, cache);
            }
        }
    }

    public static com.dk.mp.core.entity.XbPersons copy(Realm realm, com.dk.mp.core.entity.XbPersons newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.dk.mp.core.entity.XbPersons) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.dk.mp.core.entity.XbPersons realmObject = realm.createObjectInternal(com.dk.mp.core.entity.XbPersons.class, ((XbPersonsRealmProxyInterface) newObject).realmGet$prikey(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((XbPersonsRealmProxyInterface) realmObject).realmSet$id(((XbPersonsRealmProxyInterface) newObject).realmGet$id());
            ((XbPersonsRealmProxyInterface) realmObject).realmSet$name(((XbPersonsRealmProxyInterface) newObject).realmGet$name());
            ((XbPersonsRealmProxyInterface) realmObject).realmSet$departmentid(((XbPersonsRealmProxyInterface) newObject).realmGet$departmentid());
            ((XbPersonsRealmProxyInterface) realmObject).realmSet$departmentname(((XbPersonsRealmProxyInterface) newObject).realmGet$departmentname());
            ((XbPersonsRealmProxyInterface) realmObject).realmSet$phones(((XbPersonsRealmProxyInterface) newObject).realmGet$phones());
            ((XbPersonsRealmProxyInterface) realmObject).realmSet$loginname(((XbPersonsRealmProxyInterface) newObject).realmGet$loginname());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.dk.mp.core.entity.XbPersons object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.dk.mp.core.entity.XbPersons.class);
        long tableNativePtr = table.getNativeTablePointer();
        XbPersonsColumnInfo columnInfo = (XbPersonsColumnInfo) realm.schema.getColumnInfo(com.dk.mp.core.entity.XbPersons.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((XbPersonsRealmProxyInterface) object).realmGet$prikey();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(primaryKeyValue, false);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$id = ((XbPersonsRealmProxyInterface)object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        }
        String realmGet$name = ((XbPersonsRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$departmentid = ((XbPersonsRealmProxyInterface)object).realmGet$departmentid();
        if (realmGet$departmentid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.departmentidIndex, rowIndex, realmGet$departmentid, false);
        }
        String realmGet$departmentname = ((XbPersonsRealmProxyInterface)object).realmGet$departmentname();
        if (realmGet$departmentname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.departmentnameIndex, rowIndex, realmGet$departmentname, false);
        }
        String realmGet$phones = ((XbPersonsRealmProxyInterface)object).realmGet$phones();
        if (realmGet$phones != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phonesIndex, rowIndex, realmGet$phones, false);
        }
        String realmGet$loginname = ((XbPersonsRealmProxyInterface)object).realmGet$loginname();
        if (realmGet$loginname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.loginnameIndex, rowIndex, realmGet$loginname, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.dk.mp.core.entity.XbPersons.class);
        long tableNativePtr = table.getNativeTablePointer();
        XbPersonsColumnInfo columnInfo = (XbPersonsColumnInfo) realm.schema.getColumnInfo(com.dk.mp.core.entity.XbPersons.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.dk.mp.core.entity.XbPersons object = null;
        while (objects.hasNext()) {
            object = (com.dk.mp.core.entity.XbPersons) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                String primaryKeyValue = ((XbPersonsRealmProxyInterface) object).realmGet$prikey();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(primaryKeyValue, false);
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$id = ((XbPersonsRealmProxyInterface)object).realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
                }
                String realmGet$name = ((XbPersonsRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
                }
                String realmGet$departmentid = ((XbPersonsRealmProxyInterface)object).realmGet$departmentid();
                if (realmGet$departmentid != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.departmentidIndex, rowIndex, realmGet$departmentid, false);
                }
                String realmGet$departmentname = ((XbPersonsRealmProxyInterface)object).realmGet$departmentname();
                if (realmGet$departmentname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.departmentnameIndex, rowIndex, realmGet$departmentname, false);
                }
                String realmGet$phones = ((XbPersonsRealmProxyInterface)object).realmGet$phones();
                if (realmGet$phones != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phonesIndex, rowIndex, realmGet$phones, false);
                }
                String realmGet$loginname = ((XbPersonsRealmProxyInterface)object).realmGet$loginname();
                if (realmGet$loginname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.loginnameIndex, rowIndex, realmGet$loginname, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.dk.mp.core.entity.XbPersons object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.dk.mp.core.entity.XbPersons.class);
        long tableNativePtr = table.getNativeTablePointer();
        XbPersonsColumnInfo columnInfo = (XbPersonsColumnInfo) realm.schema.getColumnInfo(com.dk.mp.core.entity.XbPersons.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((XbPersonsRealmProxyInterface) object).realmGet$prikey();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = table.addEmptyRowWithPrimaryKey(primaryKeyValue, false);
        }
        cache.put(object, rowIndex);
        String realmGet$id = ((XbPersonsRealmProxyInterface)object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$name = ((XbPersonsRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$departmentid = ((XbPersonsRealmProxyInterface)object).realmGet$departmentid();
        if (realmGet$departmentid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.departmentidIndex, rowIndex, realmGet$departmentid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.departmentidIndex, rowIndex, false);
        }
        String realmGet$departmentname = ((XbPersonsRealmProxyInterface)object).realmGet$departmentname();
        if (realmGet$departmentname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.departmentnameIndex, rowIndex, realmGet$departmentname, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.departmentnameIndex, rowIndex, false);
        }
        String realmGet$phones = ((XbPersonsRealmProxyInterface)object).realmGet$phones();
        if (realmGet$phones != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phonesIndex, rowIndex, realmGet$phones, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phonesIndex, rowIndex, false);
        }
        String realmGet$loginname = ((XbPersonsRealmProxyInterface)object).realmGet$loginname();
        if (realmGet$loginname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.loginnameIndex, rowIndex, realmGet$loginname, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.loginnameIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.dk.mp.core.entity.XbPersons.class);
        long tableNativePtr = table.getNativeTablePointer();
        XbPersonsColumnInfo columnInfo = (XbPersonsColumnInfo) realm.schema.getColumnInfo(com.dk.mp.core.entity.XbPersons.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.dk.mp.core.entity.XbPersons object = null;
        while (objects.hasNext()) {
            object = (com.dk.mp.core.entity.XbPersons) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                String primaryKeyValue = ((XbPersonsRealmProxyInterface) object).realmGet$prikey();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = table.addEmptyRowWithPrimaryKey(primaryKeyValue, false);
                }
                cache.put(object, rowIndex);
                String realmGet$id = ((XbPersonsRealmProxyInterface)object).realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
                }
                String realmGet$name = ((XbPersonsRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
                }
                String realmGet$departmentid = ((XbPersonsRealmProxyInterface)object).realmGet$departmentid();
                if (realmGet$departmentid != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.departmentidIndex, rowIndex, realmGet$departmentid, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.departmentidIndex, rowIndex, false);
                }
                String realmGet$departmentname = ((XbPersonsRealmProxyInterface)object).realmGet$departmentname();
                if (realmGet$departmentname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.departmentnameIndex, rowIndex, realmGet$departmentname, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.departmentnameIndex, rowIndex, false);
                }
                String realmGet$phones = ((XbPersonsRealmProxyInterface)object).realmGet$phones();
                if (realmGet$phones != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.phonesIndex, rowIndex, realmGet$phones, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.phonesIndex, rowIndex, false);
                }
                String realmGet$loginname = ((XbPersonsRealmProxyInterface)object).realmGet$loginname();
                if (realmGet$loginname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.loginnameIndex, rowIndex, realmGet$loginname, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.loginnameIndex, rowIndex, false);
                }
            }
        }
    }

    public static com.dk.mp.core.entity.XbPersons createDetachedCopy(com.dk.mp.core.entity.XbPersons realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.dk.mp.core.entity.XbPersons unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.dk.mp.core.entity.XbPersons)cachedObject.object;
            } else {
                unmanagedObject = (com.dk.mp.core.entity.XbPersons)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.dk.mp.core.entity.XbPersons();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((XbPersonsRealmProxyInterface) unmanagedObject).realmSet$prikey(((XbPersonsRealmProxyInterface) realmObject).realmGet$prikey());
        ((XbPersonsRealmProxyInterface) unmanagedObject).realmSet$id(((XbPersonsRealmProxyInterface) realmObject).realmGet$id());
        ((XbPersonsRealmProxyInterface) unmanagedObject).realmSet$name(((XbPersonsRealmProxyInterface) realmObject).realmGet$name());
        ((XbPersonsRealmProxyInterface) unmanagedObject).realmSet$departmentid(((XbPersonsRealmProxyInterface) realmObject).realmGet$departmentid());
        ((XbPersonsRealmProxyInterface) unmanagedObject).realmSet$departmentname(((XbPersonsRealmProxyInterface) realmObject).realmGet$departmentname());
        ((XbPersonsRealmProxyInterface) unmanagedObject).realmSet$phones(((XbPersonsRealmProxyInterface) realmObject).realmGet$phones());
        ((XbPersonsRealmProxyInterface) unmanagedObject).realmSet$loginname(((XbPersonsRealmProxyInterface) realmObject).realmGet$loginname());
        return unmanagedObject;
    }

    static com.dk.mp.core.entity.XbPersons update(Realm realm, com.dk.mp.core.entity.XbPersons realmObject, com.dk.mp.core.entity.XbPersons newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((XbPersonsRealmProxyInterface) realmObject).realmSet$id(((XbPersonsRealmProxyInterface) newObject).realmGet$id());
        ((XbPersonsRealmProxyInterface) realmObject).realmSet$name(((XbPersonsRealmProxyInterface) newObject).realmGet$name());
        ((XbPersonsRealmProxyInterface) realmObject).realmSet$departmentid(((XbPersonsRealmProxyInterface) newObject).realmGet$departmentid());
        ((XbPersonsRealmProxyInterface) realmObject).realmSet$departmentname(((XbPersonsRealmProxyInterface) newObject).realmGet$departmentname());
        ((XbPersonsRealmProxyInterface) realmObject).realmSet$phones(((XbPersonsRealmProxyInterface) newObject).realmGet$phones());
        ((XbPersonsRealmProxyInterface) realmObject).realmSet$loginname(((XbPersonsRealmProxyInterface) newObject).realmGet$loginname());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("XbPersons = [");
        stringBuilder.append("{prikey:");
        stringBuilder.append(realmGet$prikey() != null ? realmGet$prikey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{departmentid:");
        stringBuilder.append(realmGet$departmentid() != null ? realmGet$departmentid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{departmentname:");
        stringBuilder.append(realmGet$departmentname() != null ? realmGet$departmentname() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phones:");
        stringBuilder.append(realmGet$phones() != null ? realmGet$phones() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{loginname:");
        stringBuilder.append(realmGet$loginname() != null ? realmGet$loginname() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XbPersonsRealmProxy aXbPersons = (XbPersonsRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aXbPersons.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aXbPersons.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aXbPersons.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
