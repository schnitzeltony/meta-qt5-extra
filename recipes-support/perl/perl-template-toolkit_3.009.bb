SUMMARY = "Template processing system"
HOMEPAGE = "http://www.template-toolkit.org/"

LICENSE = "Artistic-1.0 | GPL-1.0-only"
LIC_FILES_CHKSUM = " \
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-only;md5=e9e36a9de734199567a4d769498f743d \
" 

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Template-Toolkit-${PV}.tar.gz"
SRC_URI[sha256sum] = "d6ad23bbf637a59b5dfd1ac006460dfcb185982e4852cde77150fbd085f1f5b6"

S = "${WORKDIR}/Template-Toolkit-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
