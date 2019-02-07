SUMMARY = "Tools to assist with translation and software localization"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=98efdc0d236de427ac1ff87d5108bd36"
HOMEPAGE = "http://toolkit.translatehouse.org/"

inherit setuptools

SRC_URI = "git://github.com/translate/translate.git"
SRCREV = "44fadd143869f3b03bb93a401891fe539543b2b2"
S = "${WORKDIR}/git"
PV = "2.3.1"

do_install_append() {
    # move files to correct location
    # 1. /usr/share/lib(64) -> ${libdir}
    if [ -d ${D}${datadir}/${baselib} ] ; then
        mkdir -p ${D}/${libdir}
        cp -r ${D}${datadir}/${baselib}/* ${D}/${libdir}
        rm -rf ${D}${datadir}/${baselib}
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
