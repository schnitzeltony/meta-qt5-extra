SUMMARY = "Baloo provides searching and indexing infrastucture with an emphasis on files"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma cmake-lib

DEPENDS += "ki18n kconfig kidletime kitemmodels kinit kauth kcrash solid kio kdelibs4support kfilemetadata ktexteditor xapian-core"

PV = "5.9.0"
SRC_URI[md5sum] = "94c020690684290296a80d192989e430"
SRC_URI[sha256sum] = "d64fa65d2d0c2f063a6bc68232a9799709082cf8e10c9473c48c496b7f35d3d8"

SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Baloo, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Baloo, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir} \
	${libdir}/qml/org/kde/baloo \
	${libdir}/plugins ${libdir}/kauth \
"
FILES_${PN}-dbg += " \
	${libdir}/qml/org/kde/baloo/.debug \
	${libdir}/*/.debug \
	${libdir}/plugins/kf5/*/.debug \
"

