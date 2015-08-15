SUMMARY = "Baloo provides searching and indexing infrastucture with an emphasis on files"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    ki18n \
    kconfig \
    kidletime \
    kauth \
    kcrash \
    solid \
    kio \
    kdbusaddons \
    kitemmodels \
    kfilemetadata \
    \
    xapian-core \
"

# RESIVISIT: something strange ongoing 
# we get | /usr/lib/libKF5BalooEngine.so.5.13.0_baloo contained in package baloo requires liblmdb.so, but no providers found in its RDEPENDS [file-rdeps]
# * kfilemetadata in DEPENDS should be enough
# * there is no file 'libKF5BalooEngine.so.5.13.0_baloo' !!!

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "67bceaf70f9da493161c0eb94a214099"
SRC_URI[sha256sum] = "78d59a31b74da08089589f2df89f06b541447da3546edcccd2477add499e2f95"

SRC_URI += " \
    file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch \
    file://0002-Baloo.pc.cmake-fix-paths-for-Libs-and-Cflags.patch \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Baloo, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Baloo, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir} \
    ${libdir}/kauth \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
	${libdir}/*/.debug \
	${OE_QMAKE_PATH_QML}/org/kde/baloo/.debug \
	${OE_QMAKE_PATH_PLUGINS}/.debug \
	${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
