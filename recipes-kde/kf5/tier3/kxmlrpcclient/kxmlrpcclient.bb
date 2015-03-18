SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0603953cd62226ee9e3f034419bb88e5"
SRC_URI[sha256sum] = "832bb858a45d8a9461870c90d449bd3463ac17c51fd1111a824880b829fab475"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5XmlRpcClient, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5XmlRpcClient, -S${includedir}, -S${STAGING_INCDIR}"


