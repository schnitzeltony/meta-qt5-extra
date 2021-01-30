SUMMARY = "Tools to assist with translation and software localization"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=98efdc0d236de427ac1ff87d5108bd36"
HOMEPAGE = "http://toolkit.translatehouse.org/"

inherit setuptools3

SRC_URI = "git://github.com/translate/translate.git"
SRCREV = "d98ef03f11129fd2072c11474089a13030e93b7b"
S = "${WORKDIR}/git"
PV = "3.3.1"

do_install_append() {
    # if empty datadir -> delete
    rmdir --ignore-fail-on-non-empty ${D}${datadir}

    # ${D}${STAGING_DIR_HOST} -> ${D}
    # this is a bad hack aligning installed locations - but have not found a better way
    if [ -d ${D}${STAGING_DIR_HOST} ] ; then
        echo
        echo "Copy files from ${D}${STAGING_DIR_HOST} -> ${D}"
        cp -r ${D}${STAGING_DIR_HOST}/* ${D}
        staging_base=`echo ${STAGING_DIR_HOST} | cut -d "/" -f2`
        echo "Delete leftover $staging_base"
        rm -r ${D}/$staging_base
    fi
}

RDEPENDS_${PN} += "bash python3-core"
