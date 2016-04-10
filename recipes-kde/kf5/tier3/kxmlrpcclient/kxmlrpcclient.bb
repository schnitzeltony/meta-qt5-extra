SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "678cee98503052a3fd7872a99fc1b46b"
SRC_URI[sha256sum] = "70869ee7a649e044a63cf7198f3258bde25cdc9a6aaa74630c28a7fab6bd5820"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5XmlRpcClient, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5XmlRpcClient, -S${includedir}, -S${STAGING_INCDIR}"


