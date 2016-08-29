SUMMARY = "Tools to assist with translation and software localization"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=98efdc0d236de427ac1ff87d5108bd36"
HOMEPAGE = "http://toolkit.translatehouse.org/"

inherit setuptools

SRC_URI = " \
    https://github.com/translate/translate/releases/download/${PV}/translate-toolkit-${PV}.tar.bz2 \
"
SRC_URI[md5sum] = "f9997a0deb3f1767bb20665a47cd2708"
SRC_URI[sha256sum] = "dcbbf49058e4196a06e988d9dc1e762321ab0d057c4be035b84e3c11353fc2f8"

do_install_append() {
    # move files to correct location
    # 1. /usr/share/lib -> ${libdir}
    if [ -d ${D}${datadir}/lib ] ; then
        mkdir -p ${D}/${libdir}
        cp -r ${D}${datadir}/lib/* ${D}/${libdir}
        rm -rf ${D}${datadir}/lib
    fi
    
    # if empty datadir -> delete
    rmdir ${D}${datadir} || true

    # 2. ${D}${STAGING_DIR}/${HOST_SYS} -> ${D}
    # this is a bad hack aligning installed locations - but have not found a better way
    if [ -d ${D}${STAGING_DIR}/${HOST_SYS} ] ; then
        cp -r ${D}${STAGING_DIR}/${HOST_SYS}/* ${D}
        staging_base=`echo ${STAGING_DIR} | cut -d "/" -f2`
        rm -rf ${D}/$staging_base
    fi
}

RDEPENDS_${PN} += "bash"
