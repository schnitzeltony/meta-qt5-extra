SUMMARY = "Template processing system"
HOMEPAGE = "http://www.template-toolkit.org/"

LICENSE = "Artistic-1.0 | GPL-1.0-only"
LIC_FILES_CHKSUM = " \
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-only;md5=e9e36a9de734199567a4d769498f743d \
" 

PV = "3.010"
SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Template-Toolkit-${PV}.tar.gz"
SRC_URI[sha256sum] = "f4b65e93364088aa850887820652e467b0bce1493760fd3690268520b37d82cc"

S = "${WORKDIR}/Template-Toolkit-${PV}"

inherit cpan

do_install:append() {
    for file in ttree tpage; do
        sed -i 's:${STAGING_BINDIR_NATIVE}:${bindir_native}:g' ${D}${bindir}/$file
    done
}

BBCLASSEXTEND = "native"
